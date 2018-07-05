package net.journey.items;

import java.util.List;

import net.journey.JourneyItems;
import net.journey.JourneyTabs;
import net.journey.util.LangRegistry;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.slayer.api.SlayerAPI;

public class ItemCandyCane extends ItemFood {
	
	private boolean op;
	
    public ItemCandyCane(String name, String actual, int heal, float f, boolean sat, boolean b) {
        super(heal, sat);
        LangRegistry.addItem(SlayerAPI.PREFIX + name, actual);
        setUnlocalizedName(SlayerAPI.PREFIX + name);
        JourneyItems.items.add(this);
        JourneyItems.itemNames.add(SlayerAPI.PREFIX + name);
        setCreativeTab(JourneyTabs.crops);
        setRegistryName(SlayerAPI.MOD_ID, name);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack i) {
        return op;
    }
    
    @Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, World worldIn, List<String> list, ITooltipFlag flagIn) {
    	list.add(SlayerAPI.Colour.RED + "Mint: Increased Mining Speed");
		list.add(SlayerAPI.Colour.BLUE + "Fruity: Damage Boost");
		list.add(SlayerAPI.Colour.PURPLE + "Cherry: Regeneration");
    }
}