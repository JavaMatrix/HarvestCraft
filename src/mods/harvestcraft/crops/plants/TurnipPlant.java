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

public class TurnipPlant extends BlockCrops
{
	@SideOnly(Side.CLIENT)
	private Icon[] iconArray;
	
	public TurnipPlant(int id) //herpaderp. :)
	{
		super(id);
	}
	
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata)
	{
		if(metadata < 7)
		{
			switch (metadata) //rreturns the proper sprite.
			{
			case 0: return this.iconArray[0];
			case 1: return this.iconArray[1];
			case 2: return this.iconArray[2];
			case 3: return this.iconArray[3];
			case 4: return this.iconArray[4];
			case 5: return this.iconArray[5];
			case 6: return this.iconArray[6];
			case 7: return this.iconArray[7];
			}
		}
		return this.iconArray[7];
	}
	
	protected int getSeedItem()
	{
		return HarvestCraft.TurnipSeeds.itemID;
	}
	
	protected int getCropItem()
	{
		return HarvestCraft.Turnip.itemID;
	}
	
	@Override
	public int getRenderType()
	{
		return 1; //renders as a 'x', or flower. should we change this?
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister iconRegister) //gets sprites.
	{
		this.iconArray = new Icon[8]; //be sure to change if you change the amount of sprites.
		
		for(int i=0; i<this.iconArray.length; i++)
		{
			this.iconArray[i] = iconRegister.registerIcon("harvestcraft:turnip_"+i);
		}
	}
}

