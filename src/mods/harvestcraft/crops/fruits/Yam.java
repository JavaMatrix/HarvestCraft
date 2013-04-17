package mods.harvestcraft.crops.fruits;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.src.ModLoader;

public class Yam extends ItemFood
{
	public Yam(int id, int healAmount, float par3)
	{
		super(id, healAmount, par3, false);
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName("Yam");
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon("harvestcraft:Yam");
	}
}
