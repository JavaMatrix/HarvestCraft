package mods.harvestcraft.crops.fruits;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.src.ModLoader;

public class Watermelon extends ItemFood
{
	public Watermelon(int id, int healAmount, float par3)
	{
		super(id, healAmount, par3, false);
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName("Watermelon");
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon("harvestcraft:Watermelon");
	}
}
