package net.journey.dimension;

import java.util.ArrayList;
import java.util.List;

import net.journey.dimension.boil.BiomeGenBoiling;
import net.journey.dimension.boil.WorldProviderBoiling;
import net.journey.dimension.cloudia.BiomeGenCloudia;
import net.journey.dimension.cloudia.WorldProviderCloudia;
import net.journey.dimension.corba.BiomeGenCorba;
import net.journey.dimension.corba.WorldProviderCorba;
import net.journey.dimension.corba.biomes.BiomeGenCorbaPlains;
import net.journey.dimension.depths.BiomeGenDepths;
import net.journey.dimension.depths.WorldProviderDepths;
import net.journey.dimension.end.WorldProviderEndJourney;
import net.journey.dimension.euca.BiomeGenEuca;
import net.journey.dimension.euca.WorldProviderEuca;
import net.journey.dimension.frozen.BiomeGenFrozenLands;
import net.journey.dimension.frozen.WorldProviderFrozenLands;
import net.journey.dimension.nether.WorldProviderNetherJourney;
import net.journey.dimension.senterian.BiomeGenSenterian;
import net.journey.dimension.senterian.WorldProviderSenterian;
import net.journey.dimension.terrania.BiomeGenTerrania;
import net.journey.dimension.terrania.WorldProviderTerrania;
import net.journey.entity.mob.boiling.EntityBurningLight;
import net.journey.entity.mob.boiling.EntityFrightener;
import net.journey.entity.mob.boiling.EntityHellwing;
import net.journey.entity.mob.boiling.EntityMagmaBlaze;
import net.journey.entity.mob.boiling.EntityPhoenix;
import net.journey.entity.mob.cloudia.EntityCloudFlyer;
import net.journey.entity.mob.cloudia.EntitySkyEel;
import net.journey.entity.mob.cloudia.EntityStarlightGolem;
import net.journey.entity.mob.cloudia.EntityStarlightTransporter;
import net.journey.entity.mob.cloudia.EntityStarlightWalker;
import net.journey.entity.mob.corba.EntityLeafBlower;
import net.journey.entity.mob.corba.EntitySurfaceSeer;
import net.journey.entity.mob.corba.EntityTreeGolem;
import net.journey.entity.mob.corba.EntityWoodCreature;
import net.journey.entity.mob.corba.EntityWoodpecker;
import net.journey.entity.mob.depths.EntityDarkener;
import net.journey.entity.mob.depths.EntityDarknessCrawler;
import net.journey.entity.mob.depths.EntityDepthsBeast;
import net.journey.entity.mob.depths.EntityDepthsHunter;
import net.journey.entity.mob.depths.EntityLightener;
import net.journey.entity.mob.depths.EntityRoc;
import net.journey.entity.mob.depths.EntitySpikedBeast;
import net.journey.entity.mob.euca.EntityDynaster;
import net.journey.entity.mob.euca.EntityEucaCharger;
import net.journey.entity.mob.euca.EntityGolditeMage;
import net.journey.entity.mob.euca.EntityGoldwing;
import net.journey.entity.mob.euca.EntityShimmerer;
import net.journey.entity.mob.frozen.EntityCrystalCluster;
import net.journey.entity.mob.frozen.EntityFrozenTroll;
import net.journey.entity.mob.frozen.EntityPermafraust;
import net.journey.entity.mob.frozen.EntityShatterer;
import net.journey.entity.mob.frozen.EntityShiveringBushwalker;
import net.journey.entity.mob.frozen.EntityShiverwing;
import net.journey.entity.mob.nether.EntityHellCow;
import net.journey.entity.mob.nether.EntityHellTurtle;
import net.journey.entity.mob.nether.EntityInfernoBlaze;
import net.journey.entity.mob.nether.EntityLavasnake;
import net.journey.entity.mob.nether.EntityMiniGhast;
import net.journey.entity.mob.nether.EntityReaper;
import net.journey.entity.mob.nether.EntityWitherspine;
import net.journey.entity.mob.overworld.EntityBigHongo;
import net.journey.entity.mob.overworld.EntityBoom;
import net.journey.entity.mob.overworld.EntityFireMage;
import net.journey.entity.mob.overworld.EntityFloro;
import net.journey.entity.mob.overworld.EntityIceMage;
import net.journey.entity.mob.overworld.EntityMediumHongo;
import net.journey.entity.mob.overworld.EntitySandCrawler;
import net.journey.entity.mob.overworld.EntitySpectre;
import net.journey.entity.mob.overworld.EntitySpyclops;
import net.journey.entity.mob.overworld.EntitySwampFly;
import net.journey.entity.mob.overworld.EntityTurducken;
import net.journey.entity.mob.overworld.EntityWraith;
import net.journey.entity.mob.overworld.cold.EntityBlizzard;
import net.journey.entity.mob.overworld.jungle.EntityJungleGolem;
import net.journey.entity.mob.overworld.jungle.EntityJungleSpider;
import net.journey.entity.mob.overworld.jungle.EntityJungleTurtle;
import net.journey.entity.mob.overworld.underground.EntityBlueHonglow;
import net.journey.entity.mob.overworld.underground.EntityCaveMage;
import net.journey.entity.mob.overworld.underground.EntityCaveling;
import net.journey.entity.mob.overworld.underground.EntityCavurn;
import net.journey.entity.mob.overworld.underground.EntityGreenHonglow;
import net.journey.entity.mob.overworld.underground.EntityHonglow;
import net.journey.entity.mob.overworld.underground.EntityStonewalker;
import net.journey.entity.mob.overworld.underground.npc.EntityRockiteGolem;
import net.journey.entity.mob.terrania.mob.EntityTerraScatterer;
import net.journey.entity.mob.terrania.mob.EntityTerragrow;
import net.journey.entity.mob.terrania.mob.EntityTerralight;
import net.journey.entity.mob.terrania.mob.EntityTerrashroom;
import net.journey.entity.mob.terrania.mob.EntityTerraslug;
import net.journey.util.Config;
import net.journey.util.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.init.Biomes;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.MapGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.InitMapGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import scala.reflect.internal.Symbols.TypeSkolem;

public class DimensionHelper {

	public static final float[] boilHeight = new float[] {0.125F, 0.1F}; 
	public static final float[] corbaHeight = new float[] {0.2F, 0.2F}; 

	public static Biome euca = new BiomeGenEuca();
	public static Biome boiling = new BiomeGenBoiling();
	public static Biome cloudia = new BiomeGenCloudia();

	public static Biome corba = new BiomeGenCorba();	
	public static Biome corbaPlains = new BiomeGenCorbaPlains();

	public static Biome depths = new BiomeGenDepths();
	public static Biome frozen = new BiomeGenFrozenLands();
	public static Biome terrania = new BiomeGenTerrania();
	public static Biome senterian = new BiomeGenSenterian();

	public static DimensionType eucaType = DimensionType.register("Euca", "euca", Config.euca, WorldProviderEuca.class, Config.keepLoadingEuca);
	public static DimensionType boilingType = DimensionType.register("Boiling Point", "boilingPoint", Config.boil, WorldProviderBoiling.class, Config.keepLoadingBoil);
	public static DimensionType cloudiaType = DimensionType.register("Cloudia", "cloudia", Config.cloudia, WorldProviderCloudia.class, Config.keepLoadingCloudia);
	public static DimensionType corbaType = DimensionType.register("Corba", "corba", Config.corba, WorldProviderCorba.class, Config.keepLoadingCorba);
	public static DimensionType depthsType = DimensionType.register("Depths", "depths", Config.depths, WorldProviderDepths.class, Config.keepLoadingDepths);
	public static DimensionType frozenType = DimensionType.register("Frozen", "frozen", Config.frozen, WorldProviderFrozenLands.class, Config.keepLoadingFrozen);
	public static DimensionType terraniaType = DimensionType.register("Terrania", "terrania", Config.terrania, WorldProviderTerrania.class, Config.keepLoadingTerrania);
	public static DimensionType senterianType = DimensionType.register("Senterian", "senterian", Config.senterian, WorldProviderSenterian.class, Config.keepLoadingSenterian);

	public static void init(){

		LogHelper.info("Registering Dimensions...");
		/*if(Config.overrideNether = true) {
			DimensionManager.unregisterDimension(-1);
			DimensionManager.registerDimension(-1, DimensionType.register("Nether", "NETHER", -1, WorldProviderNetherJourney.class, true));
		}
		if(Config.overrideEnd = true) {
			DimensionManager.unregisterDimension(1);
			DimensionManager.registerDimension(1, DimensionType.register("End", "END", 1, WorldProviderEndJourney.class, true));
		} */
		addDimBiome(euca, "Euca", Type.MAGICAL, Type.MOUNTAIN);
		addDimBiome(boiling, "Boiling Point", Type.HOT);
		addDimBiome(cloudia, "Cloudia", Type.MAGICAL);
		addDimBiome(corba, "Corba", Type.DRY, Type.PLAINS, Type.DEAD);
		addDimBiome(corbaPlains, "Corba Plains", Type.DRY, Type.PLAINS, Type.DEAD);
		addDimBiome(depths, "Depths", Type.MAGICAL, Type.SPOOKY);
		addDimBiome(frozen, "Frozen Lands", Type.COLD);
		addDimBiome(terrania, "Terrania", Type.MAGICAL, Type.SPOOKY);
		addDimBiome(senterian, "Senterian Labyrinth", Type.MAGICAL, Type.SPOOKY);
		addDimension(Config.euca, eucaType);
		addDimension(Config.boil, boilingType);
		addDimension(Config.cloudia, cloudiaType);
		addDimension(Config.corba, corbaType);
		addDimension(Config.depths, depthsType);
		addDimension(Config.frozen, frozenType);
		addDimension(Config.terrania, terraniaType);
		addDimension(Config.senterian, senterianType);
	}

	private static void addDimension(int id, DimensionType type) {
		LogHelper.info("Registering dimension ID: " + id);
		DimensionManager.registerDimension(id, type);
	}

	private static Biome addDimBiome(Biome biome, String name, Type... t) {
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, t);
		LogHelper.info("Biome Registered");
		return biome;
	}

	private static Biome addOverworldBiome(Biome biome, String name, BiomeType biomeType, Type...types) {
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		LogHelper.info("Biome Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		LogHelper.info("Biome Added");
		return biome;
	}

	public static void addSpawns() {
		addEucaSpawns();
		addFrostFrozenSpawns();
		addColdFrozenSpawns();
		addBoilSpawns();
		addDepthsSpawns();
		addVanillaSpawns();
		addCaveSpawns();
		addCorbaSpawns();
		addCloudiaSpawns();
		addTerraniaSpawns();
		addCommonVanillaSpawns();
		addNetherSpawns();
	}

	private static void addCloudiaSpawns() {
		int amount = 1000;
		EntityRegistry.addSpawn(EntityStarlightTransporter.class, amount, 10, 20, EnumCreatureType.MONSTER, cloudia);
		EntityRegistry.addSpawn(EntityStarlightGolem.class, amount, 10, 20, EnumCreatureType.MONSTER, cloudia);
		EntityRegistry.addSpawn(EntityCloudFlyer.class, amount, 1, 1, EnumCreatureType.MONSTER, cloudia);
		EntityRegistry.addSpawn(EntityStarlightWalker.class, amount, 10, 20, EnumCreatureType.MONSTER, cloudia);
		EntityRegistry.addSpawn(EntitySkyEel.class, amount, 10, 20, EnumCreatureType.MONSTER, cloudia);
	}

	private static void addCorbaSpawns() {
		int amount = 20;
		EntityRegistry.addSpawn(EntityTreeGolem.class, amount, 1, 1, EnumCreatureType.MONSTER, corba);
		EntityRegistry.addSpawn(EntityLeafBlower.class, amount, 1, 1, EnumCreatureType.MONSTER, corba);
		EntityRegistry.addSpawn(EntitySurfaceSeer.class, amount, 1, 1, EnumCreatureType.MONSTER, corba);
		EntityRegistry.addSpawn(EntityWoodCreature.class, amount, 1, 1, EnumCreatureType.MONSTER, corba);
		EntityRegistry.addSpawn(EntityWoodpecker.class, amount, 1, 1, EnumCreatureType.CREATURE, corba);
	}
	private static void addColdFrozenSpawns() {
		int amount = 80;
		EntityRegistry.addSpawn(EntitySnowman.class, 2, 1, 6, EnumCreatureType.CREATURE, frozen);
		EntityRegistry.addSpawn(EntityFrozenTroll.class, amount, 10,  amount, EnumCreatureType.MONSTER, frozen);
		EntityRegistry.addSpawn(EntityPermafraust.class, amount, 10, 20, EnumCreatureType.MONSTER, frozen);
		EntityRegistry.addSpawn(EntityShiveringBushwalker.class, amount, 10, amount, EnumCreatureType.MONSTER, frozen);
		EntityRegistry.addSpawn(EntityIceMage.class, amount, 10, amount, EnumCreatureType.MONSTER, frozen);
		EntityRegistry.addSpawn(EntityShiverwing.class, amount, 10, amount, EnumCreatureType.CREATURE, frozen);

	}

	private static void addFrostFrozenSpawns() {
		int amount = 80;
		EntityRegistry.addSpawn(EntitySnowman.class, 2, 1, 6, EnumCreatureType.CREATURE, frozen);
		EntityRegistry.addSpawn(EntityPermafraust.class, amount, 10, amount, EnumCreatureType.MONSTER, frozen);
		EntityRegistry.addSpawn(EntityShatterer.class, amount, 10, amount, EnumCreatureType.MONSTER, frozen);
		EntityRegistry.addSpawn(EntityCrystalCluster.class, amount, 10, amount, EnumCreatureType.MONSTER, frozen);
		EntityRegistry.addSpawn(EntityIceMage.class, amount, 10, amount, EnumCreatureType.MONSTER, frozen);
		EntityRegistry.addSpawn(EntityShiverwing.class, amount, 10, amount, EnumCreatureType.CREATURE, frozen);
	}

	private static void addTerraniaSpawns() {
		int amount = 20;
		EntityRegistry.addSpawn(EntityTerraScatterer.class, 5, 1, 1, EnumCreatureType.MONSTER, terrania);
		EntityRegistry.addSpawn(EntityTerralight.class, 5, 1, 1, EnumCreatureType.MONSTER, terrania);
		EntityRegistry.addSpawn(EntityTerragrow.class, 5, 1, 1, EnumCreatureType.MONSTER, terrania);
		EntityRegistry.addSpawn(EntityTerrashroom.class, 5, 1, 1, EnumCreatureType.MONSTER, terrania);
		EntityRegistry.addSpawn(EntityTerraslug.class, 5, 1, 1, EnumCreatureType.MONSTER, terrania);
	}

	private static void addEucaSpawns() {
		int amount = 20;
		EntityRegistry.addSpawn(EntityEucaCharger.class, amount, 1, 1, EnumCreatureType.MONSTER, euca);
		EntityRegistry.addSpawn(EntityDynaster.class, amount, 1, 1, EnumCreatureType.MONSTER, euca);
		EntityRegistry.addSpawn(EntityShimmerer.class, amount, 1, 1, EnumCreatureType.MONSTER, euca);
		EntityRegistry.addSpawn(EntityGolditeMage.class, amount, 1, 1, EnumCreatureType.MONSTER, euca);
		EntityRegistry.addSpawn(EntityGoldwing.class, amount, 1, 1, EnumCreatureType.CREATURE, euca);
	}

	private static void addBoilSpawns() {
		int amount = 20;
		EntityRegistry.addSpawn(EntityFrightener.class, amount, 1, 1, EnumCreatureType.MONSTER, boiling);
		EntityRegistry.addSpawn(EntityBurningLight.class, amount, 1, 1, EnumCreatureType.MONSTER, boiling);
		EntityRegistry.addSpawn(EntityMagmaBlaze.class, amount, 1, 1, EnumCreatureType.MONSTER, boiling);
		EntityRegistry.addSpawn(EntityHellwing.class, amount, 1, 1, EnumCreatureType.MONSTER, boiling);
		EntityRegistry.addSpawn(EntityPhoenix.class, amount, 1, 1, EnumCreatureType.MONSTER, boiling);
	}

	private static void addDepthsSpawns() {
		int amount = 20;
		EntityRegistry.addSpawn(EntityDarknessCrawler.class, amount, 10, 1, EnumCreatureType.MONSTER, depths);
		EntityRegistry.addSpawn(EntityDepthsBeast.class, amount, 10, 1, EnumCreatureType.MONSTER, depths);
		EntityRegistry.addSpawn(EntitySpikedBeast.class, amount, 10, 1, EnumCreatureType.MONSTER, depths);
		EntityRegistry.addSpawn(EntityDepthsHunter.class, amount, 10, 1, EnumCreatureType.MONSTER, depths);
		EntityRegistry.addSpawn(EntityRoc.class, amount, 10, 1, EnumCreatureType.MONSTER, depths);
		EntityRegistry.addSpawn(EntityDarkener.class, amount, 10, 1, EnumCreatureType.MONSTER, depths);
		EntityRegistry.addSpawn(EntityLightener.class, 4, 10, 1, EnumCreatureType.MONSTER, depths);
	}

	private static void addCaveSpawns() {
		int amount = 100;
		int amount2 = 10;
		for(Biome b : Biome.REGISTRY) {
			Biome biome = b;
			if (biome != null && biome != Biomes.HELL) {
				EntityRegistry.addSpawn(EntityCaveMage.class, amount, 3, 4, EnumCreatureType.MONSTER, biome);
				EntityRegistry.addSpawn(EntityCaveling.class, amount, 3, 4, EnumCreatureType.MONSTER, biome);
				EntityRegistry.addSpawn(EntityCavurn.class, amount, 3, 4, EnumCreatureType.MONSTER, biome);
				EntityRegistry.addSpawn(EntityStonewalker.class, amount, 3, 4, EnumCreatureType.MONSTER, biome);
				EntityRegistry.addSpawn(EntityHonglow.class, amount, 3, 4, EnumCreatureType.MONSTER, biome);
				EntityRegistry.addSpawn(EntityBlueHonglow.class, amount, 3, 4, EnumCreatureType.MONSTER, biome);
				EntityRegistry.addSpawn(EntityGreenHonglow.class, amount, 3, 4, EnumCreatureType.MONSTER, biome);
				EntityRegistry.addSpawn(EntityRockiteGolem.class, amount2, 3, 4, EnumCreatureType.MONSTER, biome);
			}
		}
	}

	private static void addCommonVanillaSpawns() {
		int amount = 100;
		EntityRegistry.addSpawn(EntitySwampFly.class, amount, 3, 4, EnumCreatureType.MONSTER, Biomes.SWAMPLAND);
	}

	private static void addNetherSpawns() {
		EntityRegistry.addSpawn(EntityLavasnake.class, 80, 1, 1, EnumCreatureType.MONSTER, Biomes.HELL);
		EntityRegistry.addSpawn(EntityWitherspine.class, 80, 1, 1, EnumCreatureType.MONSTER, Biomes.HELL);
		EntityRegistry.addSpawn(EntityReaper.class, 50, 1, 1, EnumCreatureType.MONSTER, Biomes.HELL);
		EntityRegistry.addSpawn(EntityHellCow.class, 100, 1, 1, EnumCreatureType.MONSTER, Biomes.HELL);
		EntityRegistry.addSpawn(EntityMiniGhast.class, 80, 1, 1, EnumCreatureType.MONSTER, Biomes.HELL);
		EntityRegistry.addSpawn(EntityInfernoBlaze.class, 20, 1, 2, EnumCreatureType.MONSTER, Biomes.HELL);
		EntityRegistry.addSpawn(EntityHellTurtle.class, 300, 1, 2, EnumCreatureType.MONSTER, Biomes.HELL);
	}
	
	private static void addVanillaSpawns() {
		int amount = 4;
		for(Biome b : Biome.REGISTRY) {
			Biome biome = b;
			if(b != Biomes.HELL && b != Biomes.SKY && b != euca && b != boiling && b != cloudia && b != corba && b != depths && b != corbaPlains && b != frozen && b != terrania && b != senterian) {
				if (BiomeDictionary.hasType(b, BiomeDictionary.Type.SNOWY) || BiomeDictionary.hasType(b, BiomeDictionary.Type.COLD)) {
					EntityRegistry.addSpawn(EntityBlizzard.class, amount, 1, 1, EnumCreatureType.MONSTER, biome);
				}

				if (BiomeDictionary.hasType(b, BiomeDictionary.Type.FOREST) || BiomeDictionary.hasType(b, BiomeDictionary.Type.LUSH) || BiomeDictionary.hasType(b, BiomeDictionary.Type.PLAINS)) {
					EntityRegistry.addSpawn(EntityTurducken.class, amount, 1, 1, EnumCreatureType.MONSTER, biome);
					EntityRegistry.addSpawn(EntityFloro.class, amount, 1, 1, EnumCreatureType.MONSTER, biome);
					EntityRegistry.addSpawn(EntityBigHongo.class, amount, 1, 1, EnumCreatureType.MONSTER, biome);
					EntityRegistry.addSpawn(EntityMediumHongo.class, amount, 1, 1, EnumCreatureType.MONSTER, biome);
				}

				if (BiomeDictionary.hasType(b, BiomeDictionary.Type.MUSHROOM)) {
					EntityRegistry.addSpawn(EntityBigHongo.class, amount, 1, 1, EnumCreatureType.MONSTER, biome);
					EntityRegistry.addSpawn(EntityMediumHongo.class, amount, 1, 1, EnumCreatureType.MONSTER, biome);
				}

				if (BiomeDictionary.hasType(b, BiomeDictionary.Type.SANDY)) {
					EntityRegistry.addSpawn(EntitySandCrawler.class, amount, 1, 1, EnumCreatureType.MONSTER, biome);
					EntityRegistry.addSpawn(EntitySpyclops.class, amount, 1, 1, EnumCreatureType.MONSTER, biome);
					EntityRegistry.addSpawn(EntityFireMage.class, amount, 1, 1, EnumCreatureType.MONSTER, biome);
					EntityRegistry.addSpawn(EntityBoom.class, amount, 1, 1, EnumCreatureType.MONSTER, biome); 
				}

				if (BiomeDictionary.hasType(b, BiomeDictionary.Type.JUNGLE)) {
					EntityRegistry.addSpawn(EntityJungleGolem.class, 150, 1, 1, EnumCreatureType.MONSTER, biome);
					EntityRegistry.addSpawn(EntityJungleTurtle.class, 400, 1, 1, EnumCreatureType.MONSTER, biome);
					EntityRegistry.addSpawn(EntityJungleSpider.class, 400, 1, 1, EnumCreatureType.MONSTER, biome);
					EntityRegistry.addSpawn(EntityFloro.class, amount, 1, 1, EnumCreatureType.MONSTER, biome);
				}

				for(Biome b1 : Biome.REGISTRY) {
					if (b1 != null) {
						EntityRegistry.addSpawn(EntitySpectre.class, 20, 1, 1, EnumCreatureType.MONSTER, b1);
						EntityRegistry.addSpawn(EntityWraith.class, 20, 1, 1, EnumCreatureType.MONSTER, b1);
					}
				}
			}
		}
	}
}