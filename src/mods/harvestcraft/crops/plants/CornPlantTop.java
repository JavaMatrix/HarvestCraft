package mods.harvestcraft.crops.plants;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CornPlantTop extends Block
{

	public CornPlantTop(int id)
	{
		super(id, Material.plants);
	}
	
	@Override
	public int getRenderType()
	{
		return 6;
	}

}
