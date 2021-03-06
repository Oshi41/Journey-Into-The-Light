package net.slayer.api.block;

import net.journey.JourneyBlocks;
import net.journey.JourneyItems;
import net.journey.JourneyTabs;
import net.minecraft.block.BlockBookshelf;
import net.minecraft.item.ItemBlock;
import net.slayer.api.SlayerAPI;

public class BlockModBookshelf extends BlockBookshelf {
	
    public BlockModBookshelf(String name) {
        setUnlocalizedName(name);
        setCreativeTab(JourneyTabs.blocks);
        setSoundType(blockSoundType.WOOD);
        JourneyBlocks.blockName.add(SlayerAPI.PREFIX + name);
		JourneyBlocks.blocks.add(this);
		setRegistryName(SlayerAPI.MOD_ID, name);
		JourneyItems.items.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }
}