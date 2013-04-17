package mods.harvestcraft;

import mods.harvestcraft.crops.plants.*;
import mods.harvestcraft.crops.fruits.*;
import mods.harvestcraft.crops.seeds.*;
import mods.harvestcraft.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="HarvestCraft", version="Alpha 0.0.1", useMetadata=true)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class HarvestCraft 
{
	
	//Item Declarations
	public static ItemSeeds turnipSeeds;
	public static Item turnip;
	public static Block turnipPlant;
	
	
	@Instance("HarvestCraft")
	public static HarvestCraft instance;
	
	
	@SidedProxy(clientSide="mods.harvestcraft.proxy.ClientProxy",
	            serverSide="mods.harvestcraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) 
	{
		
		Config.load(event.getSuggestedConfigurationFile());
		
	}

	
	@Init
	public void load(FMLInitializationEvent event) 
	{
		//Block Declarations
		turnipPlant = new TurnipPlant(500);
		
		//Item Declarations
		turnipSeeds = new TurnipSeeds(5001, turnipPlant.blockID, Block.tilledField.blockID);
		turnip = new Turnip(5002);
		
		//Language Registry
		LanguageRegistry.addName(turnipSeeds, "Turnip Seeds");
		LanguageRegistry.addName(turnip, "Turnip");
		
		//Other Hook Needs
		MinecraftForge.addGrassSeed(new ItemStack(turnipSeeds), 5);
		
		proxy.init();
	
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
