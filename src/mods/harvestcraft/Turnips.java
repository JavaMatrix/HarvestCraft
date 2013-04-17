package mods.harvestcraft;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;

public class Turnips extends Item {

	public Turnips(int id) {
		super(id);
		// TODO Auto-generated constructor stub
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("turnips");
		
	}
	
	public void updateIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("harvestcraft:turnips");
	}
}
