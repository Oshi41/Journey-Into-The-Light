package net.journey.dimension.boil.gen;

import java.util.Random;

import net.journey.JourneyBlocks;
import net.journey.entity.mob.boiling.npc.EntityBoilTrader;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.slayer.api.worldgen.WorldGenAPI;

public class WorldGenTraderHutBoiling extends WorldGenerator {
	
	public boolean locationIsValidSpawn(World w, int x, int y, int z) {
		return WorldGenAPI.checkRadius(w, new BlockPos(x,y,z), 11, JourneyBlocks.hotBlock);
	}
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		int i = pos.getX(), j = pos.getY(), k = pos.getZ();
		if(locationIsValidSpawn(world, i, j, k)) return true;
		IBlockState leaves = WorldGenAPI.getCorbaLeaves().getDefaultState(), log = WorldGenAPI.getCorbaLog().getDefaultState();
		i-=5;
		k-=5;
		world.setBlockState(new BlockPos(i + 0, j + 7, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 0, j + 7, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 0, j + 7, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 1, j + 0, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 0, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 1, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 1, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 2, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 2, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 1, j + 3, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 1, j + 4, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 5, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 5, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 1, j + 5, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 1, j + 5, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 6, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 6, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 1, j + 6, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 1, j + 6, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 1, j + 6, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 1, j + 7, k + 0), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 1, j + 7, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 1, j + 7, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 1, j + 7, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 1, j + 7, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 1, j + 7, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 1, j + 7, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 1, j + 8, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 1, j + 8, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 1, j + 8, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 2, j + 3, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 2, j + 4, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 2, j + 4, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 2, j + 5, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 2, j + 5, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 2, j + 6, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 2, j + 6, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 2, j + 7, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 2, j + 7, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 2, j + 8, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 2, j + 8, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 2, j + 8, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 3), JourneyBlocks.boilingLamp.getDefaultState());
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 3, j + 3, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 3, j + 6, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 3, j + 6, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 3, j + 7, k + 0), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 3, j + 7, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 3, j + 7, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 3, j + 7, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 3, j + 8, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 3, j + 8, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 3, j + 8, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 3, j + 8, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 3, j + 8, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 4, j + 3, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 4, j + 4, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 4, j + 4, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 4, j + 5, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 4, j + 5, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 4, j + 6, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 4, j + 6, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 4, j + 7, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 4, j + 7, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 4, j + 8, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 4, j + 8, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 4, j + 8, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 5, j + 0, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 0, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 1, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 1, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 2, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 2, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 5, j + 3, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 5, j + 4, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 5, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 5, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 5, j + 5, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 5, j + 5, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 6, k + 1), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 6, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 5, j + 6, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 5, j + 6, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(3));
		world.setBlockState(new BlockPos(i + 5, j + 6, k + 5), JourneyBlocks.boilingLog.getDefaultState());
		world.setBlockState(new BlockPos(i + 5, j + 7, k + 0), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 5, j + 7, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 5, j + 7, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 5, j + 7, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 5, j + 7, k + 4), JourneyBlocks.brisonblocks.getStateFromMeta(2));
		world.setBlockState(new BlockPos(i + 5, j + 7, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 5, j + 7, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 5, j + 8, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 5, j + 8, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 5, j + 8, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 6, j + 7, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 6, j + 7, k + 3), JourneyBlocks.brisonblocks.getStateFromMeta(0));
		world.setBlockState(new BlockPos(i + 6, j + 7, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(0));

		if(!world.isRemote) {
			EntityBoilTrader smith = new EntityBoilTrader(world);
			smith.setLocationAndAngles(i + 3, j + 6, k + 3, 0.0F, 0.0F);
			world.spawnEntity(smith);
		}
		return false;

	}
}