package mods.harvestcraft.crops.seeds;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.src.ModLoader;

public class TurnipSeeds extends ItemSeeds 
{

	public TurnipSeeds(int id, int plantId, int soilId) 
	{
		super(id, plantId, soilId);
		// TODO Auto-generated constructor stub
		this.setMaxStackSize(64); //change this, maybe?
		this.setCreativeTab(CreativeTabs.tabMaterials); //Change this later.
		this.setUnlocalizedName("Turnip Seeds");
		this.bFull3D=true; //Allows it to be rendered in full 3D
		
	}
	
	@Override
	public void registerIcons(IconRegister iconRegister) //could we do some sort of special rendering here?
	{
		this.itemIcon = iconRegister.registerIcon("harvestcraft:turnipseeds");
	}
}
