package net.journey.items.bows;

import javax.annotation.Nullable;

import net.journey.JourneyWeapons;
import net.journey.entity.projectile.EntityEssenceArrow;
import net.journey.items.ItemModBow;
import net.journey.util.PotionEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TerrianBow extends ItemModBow {

    public TerrianBow(String unlocalizedName, int damage, int durability) {
        super(unlocalizedName, "Terrian Bow", durability, damage, "Poisons targets");
        this.effect = EntityEssenceArrow.BowEffects.POISON_BOW;
    }

    @Override
    public void addPropertyOverrides() {
		this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter() {
			@SideOnly(Side.CLIENT)
			public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
				if (entityIn == null) {
					return 0.0F;
				} else {
					return entityIn.getActiveItemStack().getItem() != JourneyWeapons.terrianBow ? 0.0F
							: (float) (stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F;
				}
			}
		});
		this.addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter() {
			@SideOnly(Side.CLIENT)
			public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn) {
				return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F
						: 0.0F;
			}
		});
	}

}
