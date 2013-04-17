package mods.harvestcraft.crops.plants;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class TurnipPlant extends Block
{
	public TurnipPlant(int id)
	{
		super(id, Material.plants);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.9F, 0.8F, 0.9F);
	}
	
/*	@Override
	public final Icon getBlockTextureFromSide(int side)
	/* We need to finish the turnips code. It crashes with every placement of seeds
	 * 
	 * Would someone with modding experience please help!
	 *
	{
		
	}*/
	
	@Override
	public void registerIcons(IconRegister register)
	{
		this.blockIcon = register.registerIcon("harvestcraft:turnipplant");
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
		return null;
	}
	
	@Override
	public int getRenderType()
	{
		return 1;
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
	@Override
	public void updateTick (World world, int x, int y, int z, Random random) {
		if (world.getBlockMetadata(x, y, z) == 1) {
			return;
		}

		if (random.nextInt(isFertile(world, x, y - 1, z) ? 12 : 25) != 0) {
			return;
		}

		world.setBlockMetadataWithNotify(x, y, z, 1, 1);
	}
}
