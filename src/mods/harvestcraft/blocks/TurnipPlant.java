package mods.harvestcraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class TurnipPlant extends BlockCrops
{
	public TurnipPlant(int id)
	{
		super(id);
	}
	
	@Override
	public void registerIcons(IconRegister register)
	{
		this.blockIcon = register.registerIcon("harvestcraft:turnipplant");
	}
	
	//Rendering Code
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
		return null;
	}
	
	@Override
	public int getRenderType()
	{
		return 6;
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
}
