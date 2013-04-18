package mods.harvestcraft.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Flour extends Item {

		public Flour(int id) 
		{
			super(id);
			// TODO Auto-generated constructor stub
			 this.setUnlocalizedName("flour");
			 this.setCreativeTab(CreativeTabs.tabMaterials);
		}
		
		@Override
		public void registerIcons(IconRegister iconRegister)
		{
			this.itemIcon = iconRegister.registerIcon("harvestcraft:Flour");
		}
	}
