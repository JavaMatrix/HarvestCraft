package mods.harvestcraft.crops.fruits;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;

public class Turnip extends Item
{
	public Turnip(int id)
	{
		super(id);
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabs.tabFood);
		this.setUnlocalizedName("Turnips");
		this.bFull3D=true;
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		this.itemIcon = iconRegister.registerIcon("harvestcraft:turnip");
	}
}
