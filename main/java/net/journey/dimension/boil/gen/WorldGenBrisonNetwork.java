package net.journey.dimension.boil.gen;

import java.util.Random;

import net.journey.JourneyBlocks;
import net.journey.entity.mob.boiling.npc.EntityEscapedConvict;
import net.journey.util.enums.EnumTypeLogs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.slayer.api.block.BlockModLog;
import net.slayer.api.worldgen.WorldGenAPI;

public class WorldGenBrisonNetwork extends WorldGenerator {
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		int i = pos.getX(), j = pos.getY(), k = pos.getZ();
		IBlockState leaves = WorldGenAPI.getCorbaLeaves().getDefaultState(), log = WorldGenAPI.getCorbaLog().getDefaultState();
		i-=5;
		k-=5;
			world.setBlockState(new BlockPos(i + 0, j + 0, k + 1), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 11, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 0, j + 11, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 0, j + 11, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 0, j + 12, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 0, j + 12, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 12, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 0, j + 13, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 0, j + 13, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 13, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 0, j + 14, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 0, j + 14, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 0, j + 14, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 0, j + 15, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 0, j + 15, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 0, j + 15, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 1, j + 11, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 1, j + 11, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 1, j + 12, k + 6), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 12, k + 8), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 13, k + 6), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 13, k + 8), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 14, k + 6), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 14, k + 7), JourneyBlocks.boilingLamp.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 14, k + 8), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 15, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 1, j + 15, k + 7), JourneyBlocks.screamerSpawner.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 15, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 1, j + 16, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 1, j + 17, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 11, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 2, j + 11, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 2, j + 11, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 2, j + 12, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 2, j + 12, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 12, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 2, j + 13, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 2, j + 13, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 13, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 2, j + 14, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 2, j + 14, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 2, j + 14, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 2, j + 15, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 2, j + 15, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 2, j + 15, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 2, j + 17, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 3, j + 17, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 4, j + 17, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 5, j + 0, k + 9), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 5, j + 1, k + 5), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 5, j + 1, k + 6), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 1, k + 8), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 1, k + 9), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 5, j + 2, k + 5), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 5, j + 2, k + 6), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 2, k + 8), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 2, k + 9), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 5, j + 3, k + 5), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 5, j + 3, k + 6), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 3, k + 8), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 3, k + 9), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 5), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 6), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 8), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 5, j + 4, k + 9), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 5, j + 17, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 0, k + 9), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 1, k + 5), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 1, k + 9), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 2, k + 5), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 2, k + 9), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 3, k + 5), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 3, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 3, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 3, k + 9), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 5), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 9), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 12), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 13), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 4, k + 14), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 5, k + 12), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 5, k + 13), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 5, k + 14), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 12), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 13), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 6, k + 14), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 7, k + 12), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 7, k + 13), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 7, k + 14), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 8, k + 12), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 8, k + 13), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 8, k + 14), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 10, k + 0), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 10, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 10, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 11, k + 0), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 11, k + 1), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 11, k + 2), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 12, k + 0), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 12, k + 1), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 12, k + 2), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 13, k + 0), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 13, k + 1), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 13, k + 2), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 0), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 14, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 6, j + 15, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 16, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 6, j + 17, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(0));
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 0, k + 9), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 7), JourneyBlocks.boilingLamp.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 12), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 4, k + 14), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 5, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 5, k + 12), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 5, k + 14), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 12), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 6, k + 14), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 7, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 7, k + 12), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 7, k + 13), JourneyBlocks.boilingLamp.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 7, k + 14), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 8, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 8, k + 12), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 8, k + 13), JourneyBlocks.observerSpawner.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 8, k + 14), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 9, k + 7), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 7, j + 9, k + 8), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 9, k + 13), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 10, k + 0), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 10, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 10, k + 7), JourneyBlocks.boilingLamp.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 10, k + 8), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 10, k + 9), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 10, k + 10), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 10, k + 11), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 10, k + 12), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 10, k + 13), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 11, k + 0), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 11, k + 2), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 11, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 12, k + 0), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 12, k + 2), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 12, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 13, k + 0), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 13, k + 1), JourneyBlocks.boilingLamp.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 13, k + 2), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 13, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 0), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 1), JourneyBlocks.screamerSpawner.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 7, j + 14, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 15, k + 1), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 15, k + 6), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 15, k + 7), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 1), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 2), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 3), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 4), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 5), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 6), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 7, j + 16, k + 7), JourneyBlocks.boilingLamp.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 0, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 0, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 0, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 0, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 0, k + 9), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 1, k + 5), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 1, k + 9), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 2, k + 5), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 2, k + 9), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 3, k + 5), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 3, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 3, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 3, k + 9), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 5), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 9), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 12), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 13), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 4, k + 14), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 5, k + 12), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 5, k + 13), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 5, k + 14), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 6, k + 12), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 6, k + 13), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 6, k + 14), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 7, k + 12), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 7, k + 13), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 7, k + 14), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 8, k + 12), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 8, k + 13), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 8, k + 14), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 10, k + 0), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 10, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 10, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 10, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 11, k + 0), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 11, k + 1), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 11, k + 2), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 11, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 12, k + 0), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 12, k + 1), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 12, k + 2), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 13, k + 0), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 13, k + 1), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 8, j + 13, k + 2), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 0), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 1), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 8, j + 14, k + 2), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 9, j + 0, k + 5), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 9, j + 0, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 9, j + 0, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 9, j + 0, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 9, j + 0, k + 9), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 9, j + 1, k + 5), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 9, j + 1, k + 6), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 1, k + 8), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 1, k + 9), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 9, j + 2, k + 5), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 9, j + 2, k + 6), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 2, k + 8), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 2, k + 9), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 9, j + 3, k + 5), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 9, j + 3, k + 6), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 3, k + 8), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 3, k + 9), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 9, j + 4, k + 5), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 9, j + 4, k + 6), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 4, k + 8), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 9, j + 4, k + 9), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 9, j + 11, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 10, j + 11, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 11, j + 11, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 12, j + 5, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 12, j + 5, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 12, j + 5, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 12, j + 6, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 12, j + 6, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 12, j + 6, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 12, j + 7, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 12, j + 7, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 12, j + 7, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 12, j + 8, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 12, j + 8, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 12, j + 8, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 12, j + 9, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 12, j + 9, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 12, j + 9, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 12, j + 11, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 13, j + 5, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 13, j + 5, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 13, j + 6, k + 6), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 13, j + 6, k + 8), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 13, j + 7, k + 6), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 13, j + 7, k + 8), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 13, j + 8, k + 6), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 13, j + 8, k + 7), JourneyBlocks.boilingLamp.getDefaultState());
			world.setBlockState(new BlockPos(i + 13, j + 8, k + 8), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 13, j + 9, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 13, j + 9, k + 7), JourneyBlocks.observerSpawner.getDefaultState());
			world.setBlockState(new BlockPos(i + 13, j + 9, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 13, j + 10, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 13, j + 11, k + 7), JourneyBlocks.sizzlingPost.getDefaultState());
			world.setBlockState(new BlockPos(i + 14, j + 5, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 14, j + 5, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 14, j + 5, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 14, j + 6, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 14, j + 6, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 14, j + 6, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 14, j + 7, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 14, j + 7, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 14, j + 7, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 14, j + 8, k + 6), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 14, j + 8, k + 7), JourneyBlocks.boilingBars.getDefaultState());
			world.setBlockState(new BlockPos(i + 14, j + 8, k + 8), JourneyBlocks.logs.getDefaultState().withProperty(BlockModLog.VARIANT, EnumTypeLogs.EnumType.BOILING_LOG));
			world.setBlockState(new BlockPos(i + 14, j + 9, k + 6), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 14, j + 9, k + 7), JourneyBlocks.brisonblocks.getStateFromMeta(3));
			world.setBlockState(new BlockPos(i + 14, j + 9, k + 8), JourneyBlocks.brisonblocks.getStateFromMeta(3));

			//707
			if(!world.isRemote) {
				EntityEscapedConvict smith = new EntityEscapedConvict(world);
				smith.setLocationAndAngles(i + 7, j + 1, k + 7, 0.0F, 0.0F);
				world.spawnEntity(smith);
			}
			return false;
	}
}