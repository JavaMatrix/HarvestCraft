package mods.harvestcraft.seeds;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;

public class TurnipSeeds extends Item 
{

	public TurnipSeeds(int id) 
	{
		super(id);
		// TODO Auto-generated constructor stub
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName("turnips");
		this.bFull3D=true;
		
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
	         this.itemIcon = iconRegister.registerIcon("harvestcraft:turnips");
	}
}
