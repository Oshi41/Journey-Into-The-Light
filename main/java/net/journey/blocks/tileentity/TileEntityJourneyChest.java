package net.journey.blocks.tileentity;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Nullable;

import net.journey.JourneySounds;
import net.journey.blocks.machines.BlockJourneyChest;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.datafix.FixTypes;
import net.minecraft.util.datafix.walkers.ItemStackDataLists;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.slayer.api.JourneyDoubleChestHandler;

public class TileEntityJourneyChest extends TileEntityLockableLoot implements ITickable {
	private NonNullList<ItemStack> chestContents = NonNullList.<ItemStack>withSize(27, ItemStack.EMPTY);
	public boolean adjacentChestChecked;
	public TileEntityJourneyChest adjacentChestZNeg;
	public TileEntityJourneyChest adjacentChestXPos;
	public TileEntityJourneyChest adjacentChestXNeg;
	public TileEntityJourneyChest adjacentChestZPos;
	public float lidAngle;
	public float prevLidAngle;
	public int numPlayersUsing;
	private int ticksSinceSync;
	private BlockJourneyChest.Type cachedChestType;

	public TileEntityJourneyChest() {
	}

	public TileEntityJourneyChest(BlockJourneyChest.Type typeIn) {
		this.cachedChestType = typeIn;
	}

	@Override
	public int getSizeInventory() {
		return 27;
	}

	@Override
	public boolean isEmpty() {
		for (ItemStack itemstack : this.chestContents) {
			if (!itemstack.isEmpty()) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String getName() {
		return this.hasCustomName() ? this.customName : "container.chest";
	}

	public static void registerFixesJourneyChest(DataFixer fixer) {
		fixer.registerWalker(FixTypes.BLOCK_ENTITY,
				new ItemStackDataLists(TileEntityJourneyChest.class, new String[] { "Items" }));
	}

	@Override
	public void readFromNBT(NBTTagCompound compound) {
		super.readFromNBT(compound);
		this.chestContents = NonNullList.<ItemStack>withSize(this.getSizeInventory(), ItemStack.EMPTY);

		if (!this.checkLootAndRead(compound)) {
			ItemStackHelper.loadAllItems(compound, this.chestContents);
		}

		if (compound.hasKey("CustomName", 8)) {
			this.customName = compound.getString("CustomName");
		}
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		super.writeToNBT(compound);

		if (!this.checkLootAndWrite(compound)) {
			ItemStackHelper.saveAllItems(compound, this.chestContents);
		}

		if (this.hasCustomName()) {
			compound.setString("CustomName", this.customName);
		}

		return compound;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public void updateContainingBlockInfo() {
		super.updateContainingBlockInfo();
		this.adjacentChestChecked = false;
		doubleChestHandler = null;
	}

	@SuppressWarnings("incomplete-switch")
	private void setNeighbor(TileEntityJourneyChest chestTe, EnumFacing side) {
		if (chestTe.isInvalid()) {
			this.adjacentChestChecked = false;
		} else if (this.adjacentChestChecked) {
			switch (side) {
			case NORTH:

				if (this.adjacentChestZNeg != chestTe) {
					this.adjacentChestChecked = false;
				}

				break;
			case SOUTH:

				if (this.adjacentChestZPos != chestTe) {
					this.adjacentChestChecked = false;
				}

				break;
			case EAST:

				if (this.adjacentChestXPos != chestTe) {
					this.adjacentChestChecked = false;
				}

				break;
			case WEST:

				if (this.adjacentChestXNeg != chestTe) {
					this.adjacentChestChecked = false;
				}
			}
		}
	}

	public void checkForAdjacentChests() {
		if (!this.adjacentChestChecked) {
			if (this.world == null || !this.world.isAreaLoaded(this.pos, 1))
				return; // Forge: prevent loading unloaded chunks when checking
						// neighbors
			this.adjacentChestChecked = true;
			this.adjacentChestXNeg = this.getAdjacentChest(EnumFacing.WEST);
			this.adjacentChestXPos = this.getAdjacentChest(EnumFacing.EAST);
			this.adjacentChestZNeg = this.getAdjacentChest(EnumFacing.NORTH);
			this.adjacentChestZPos = this.getAdjacentChest(EnumFacing.SOUTH);
		}
	}

	@Nullable
	protected TileEntityJourneyChest getAdjacentChest(EnumFacing side) {
		BlockPos blockpos = this.pos.offset(side);

		if (this.isChestAt(blockpos)) {
			TileEntity tileentity = this.world.getTileEntity(blockpos);

			if (tileentity instanceof TileEntityJourneyChest) {
				TileEntityJourneyChest tileentitychest = (TileEntityJourneyChest) tileentity;
				tileentitychest.setNeighbor(this, side.getOpposite());
				return tileentitychest;
			}
		}

		return null;
	}

	private boolean isChestAt(BlockPos posIn) {
		if (this.world == null) {
			return false;
		} else {
			Block block = this.world.getBlockState(posIn).getBlock();
			return block instanceof BlockJourneyChest && ((BlockJourneyChest) block).chestType == this.getChestType();
		}
	}

	@Override
	public void update() {
		this.checkForAdjacentChests();
		int i = this.pos.getX();
		int j = this.pos.getY();
		int k = this.pos.getZ();
		++this.ticksSinceSync;

		if (!this.world.isRemote && this.numPlayersUsing != 0 && (this.ticksSinceSync + i + j + k) % 200 == 0) {
			this.numPlayersUsing = 0;
			float f = 5.0F;

			for (EntityPlayer entityplayer : this.world.getEntitiesWithinAABB(EntityPlayer.class,
					new AxisAlignedBB((double) ((float) i - 5.0F), (double) ((float) j - 5.0F),
							(double) ((float) k - 5.0F), (double) ((float) (i + 1) + 5.0F),
							(double) ((float) (j + 1) + 5.0F), (double) ((float) (k + 1) + 5.0F)))) {
				if (entityplayer.openContainer instanceof ContainerChest) {
					IInventory iinventory = ((ContainerChest) entityplayer.openContainer).getLowerChestInventory();

					if (iinventory == this || iinventory instanceof InventoryLargeChest
							&& ((InventoryLargeChest) iinventory).isPartOfLargeChest(this)) {
						++this.numPlayersUsing;
					}
				}
			}
		}

		this.prevLidAngle = this.lidAngle;
		float f1 = 0.1F;

		if (this.numPlayersUsing > 0 && this.lidAngle == 0.0F && this.adjacentChestZNeg == null
				&& this.adjacentChestXNeg == null) {
			double d1 = (double) i + 0.5D;
			double d2 = (double) k + 0.5D;

			if (this.adjacentChestZPos != null) {
				d2 += 0.5D;
			}

			if (this.adjacentChestXPos != null) {
				d1 += 0.5D;
			}

			this.world.playSound((EntityPlayer) null, d1, (double) j + 0.5D, d2, SoundEvents.BLOCK_CHEST_OPEN,
					SoundCategory.BLOCKS, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.735F);
		}

		if (this.numPlayersUsing == 0 && this.lidAngle > 0.0F || this.numPlayersUsing > 0 && this.lidAngle < 1.0F) {
			float f2 = this.lidAngle;

			if (this.numPlayersUsing > 0) {
				this.lidAngle += 0.1F;
			} else {
				this.lidAngle -= 0.1F;
			}

			if (this.lidAngle > 1.0F) {
				this.lidAngle = 1.0F;
			}

			float f3 = 0.5F;

			if (this.lidAngle < 0.5F && f2 >= 0.5F && this.adjacentChestZNeg == null
					&& this.adjacentChestXNeg == null) {
				double d3 = (double) i + 0.5D;
				double d0 = (double) k + 0.5D;

				if (this.adjacentChestZPos != null) {
					d0 += 0.5D;
				}

				if (this.adjacentChestXPos != null) {
					d3 += 0.5D;
				}

				this.world.playSound((EntityPlayer) null, d3, (double) j + 0.5D, d0, SoundEvents.BLOCK_CHEST_CLOSE,
						SoundCategory.BLOCKS, 0.5F, this.world.rand.nextFloat() * 0.1F + 0.735F);
			}

			if (this.lidAngle < 0.0F) {
				this.lidAngle = 0.0F;
			}
		}
	}

	@Override
	public boolean receiveClientEvent(int id, int type) {
		if (id == 1) {
			this.numPlayersUsing = type;
			return true;
		} else {
			return super.receiveClientEvent(id, type);
		}
	}

	@Override
	public void openInventory(EntityPlayer player) {
		if (!player.isSpectator()) {
			if (this.numPlayersUsing < 0) {
				this.numPlayersUsing = 0;
			}

			++this.numPlayersUsing;
			this.world.addBlockEvent(this.pos, this.getBlockType(), 1, this.numPlayersUsing);
			this.world.notifyNeighborsOfStateChange(this.pos, this.getBlockType(), false);
		}
	}

	@Override
	public void closeInventory(EntityPlayer player) {
		if (!player.isSpectator() && this.getBlockType() instanceof BlockJourneyChest) {
			--this.numPlayersUsing;
			this.world.addBlockEvent(this.pos, this.getBlockType(), 1, this.numPlayersUsing);
			this.world.notifyNeighborsOfStateChange(this.pos, this.getBlockType(), false);
		}
	}

	public JourneyDoubleChestHandler doubleChestHandler;

	@Override
	@Nullable
	public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability,
			@Nullable net.minecraft.util.EnumFacing facing) {
		if (capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
			if (doubleChestHandler == null || doubleChestHandler.needsRefresh())
				doubleChestHandler = JourneyDoubleChestHandler.get(this);
			if (doubleChestHandler != null
					&& doubleChestHandler != JourneyDoubleChestHandler.NO_ADJACENT_CHESTS_INSTANCE)
				return (T) doubleChestHandler;
		}
		return super.getCapability(capability, facing);
	}

	public net.minecraftforge.items.IItemHandler getSingleChestHandler() {
		return super.getCapability(net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
	}

	@Override
	public void invalidate() {
		super.invalidate();
		this.updateContainingBlockInfo();
		this.checkForAdjacentChests();
	}

	public BlockJourneyChest.Type getChestType() {
		if (this.cachedChestType == null) {
			if (this.world == null || !(this.getBlockType() instanceof BlockChest)) {
				return BlockJourneyChest.Type.JOURNEY;
			}

			this.cachedChestType = ((BlockJourneyChest) this.getBlockType()).chestType;
		}

		return this.cachedChestType;
	}

	@Override
	public String getGuiID() {
		return "minecraft:chest";
	}

	@Override
	public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
		this.fillWithLoot(playerIn);
		return new ContainerChest(playerInventory, this, playerIn);
	}

	@Override
	protected NonNullList<ItemStack> getItems() {
		return this.chestContents;
	}
}