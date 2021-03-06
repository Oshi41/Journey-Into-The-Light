package net.journey.proxy;

import net.journey.JITL;
import net.journey.client.BossTickHandler;
import net.journey.client.EntityRendering;
import net.journey.client.GuiHandler;
import net.journey.client.PlayerStats;
import net.journey.client.RenderHandler;
import net.journey.client.render.particles.OreParticleFX;
import net.journey.client.server.EssenceBar;
import net.journey.client.server.EssenceProvider;
import net.journey.client.server.IEssence;
import net.journey.enums.EnumParticlesClasses;
import net.journey.event.ClientTickEvent;
import net.journey.event.UpdateCheckerEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.Particle;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.slayer.api.SlayerAPI;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerClient() {
		NetworkRegistry.INSTANCE.registerGuiHandler(JITL.instance, new GuiHandler());
		SlayerAPI.registerEvent(new UpdateCheckerEvent());
	}

	@Override
	public void clientPreInit() {
		SlayerAPI.registerEvent(new RenderHandler());
	}

	@Override
	public void clientInit(FMLInitializationEvent event) {
		EntityRendering.init();
		SlayerAPI.registerEvent(new BossTickHandler());
		SlayerAPI.registerEvent(new ClientTickEvent());
		SlayerAPI.registerEvent(new PlayerStats());
	}

	@Override
	public void spawnParticle(EnumParticlesClasses particle, World worldObj, double posX, double posY, double posZ, boolean b) {
		try {
			Particle fx = null;
			if(b) {
				fx = (Particle)particle.getParticle().getConstructor(World.class, double.class, double.class, double.class).newInstance(worldObj, posX, posY, posZ);
			} else {
				fx = (Particle)particle.getParticle().getConstructor(World.class, double.class, double.class, double.class, double.class, double.class, double.class).newInstance(worldObj, posX, posY, posZ, 0D, 0D, 0D);
			}
			FMLClientHandler.instance().getClient().effectRenderer.addEffect(fx);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void spawnParticle(EnumParticlesClasses particle, World worldObj, double posX, double posY, double posZ, double posX1, double posY1, double posZ1) {
		try {
			Particle fx = (Particle)particle.getParticle().getConstructor(World.class, double.class, double.class, double.class, double.class, double.class, double.class).newInstance(worldObj, posX, posY, posZ, posX1, posY1, posZ1);
			Minecraft.getMinecraft().effectRenderer.addEffect(fx);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void spawnOreParticle(World w, double x, double y, double z, float r, float g, float b) {
		OreParticleFX fx = new OreParticleFX(w, x, y, z, r, g, b);
		if(fx != null)
			Minecraft.getMinecraft().effectRenderer.addEffect(fx);

	}
}