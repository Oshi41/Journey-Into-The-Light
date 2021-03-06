package net.journey.entity.projectile;

import java.util.Random;

import net.journey.JITL;
import net.journey.client.render.particles.EntityFireballFX;
import net.journey.client.render.particles.EntityWitherFX;
import net.journey.enums.EnumParticlesClasses;
import net.journey.util.PotionEffects;
import net.minecraft.client.particle.Particle;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.FMLClientHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityWithic extends EntityBasicProjectile {

	public EntityWithic(World var1) {
		super(var1);
	}
	
	public EntityWithic(World var1, EntityLivingBase var3, float dam) {
		super(var1, var3, dam);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void onUpdate() {
		Random rand = new Random();
		super.onUpdate();
		for(int i = 0; i < 20; ++i) {
			JITL.proxy.spawnParticle(EnumParticlesClasses.WITHER, this.world, this.posX, this.posY - 1.0F, this.posZ, false);
		}
	}
	
	@Override
	protected void onImpact(RayTraceResult var1) {
		if(var1.entityHit != null) { 
			var1.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), getDamage());
			((EntityLivingBase) var1.entityHit).addPotionEffect(new PotionEffect(PotionEffects.getPotionFromID(PotionEffects.wither), 100, 1));
		}
		if(!world.isRemote) this.setDead();
	}
	
	@Override
	protected float getGravityVelocity() {
		return 0.032F;
	}
}