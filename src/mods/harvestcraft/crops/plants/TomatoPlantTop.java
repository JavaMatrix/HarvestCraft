package mods.harvestcraft.crops.plants;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TomatoPlantTop extends Block
{

	public TomatoPlantTop(int id) {
		super(id, Material.plants);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getRenderType()
	{
		return 6;
	}

}
