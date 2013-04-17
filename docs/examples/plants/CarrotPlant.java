package mods.harvestcraft.crops.plants;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import mods.harvestcraft.HarvestCraft;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class CarrotPlant extends BlockCrops
{
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;
	
	public CarrotPlant(int id)
	{
		super(id);
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata)
	{
		if(metadata < 7)
		{
			if(metadata<=6 && metadata >=2)
			{
				return this.iconArray[1];
			}
			
			else
			{
				return this.iconArray[0];
			}
		}
		else
		{
			return this.iconArray[2];
		}
	}
	
	protected int getSeedItem()
	{
		return HarvestCraft.CarrotSeeds.itemID;
	}
	
	protected int getCropItem()
	{
		return HarvestCraft.Carrot.itemID;
	}
	
	@Override
	public int getRenderType()
	{
		return 1;
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister)
	{
		this.iconArray = new Icon[3];
		
		for(int i=0; i<this.iconArray.length; i++)
		{
			this.iconArray[i] = iconRegister.registerIcon("harvestcraft:Carrot_"+i);
		}
	}
}

