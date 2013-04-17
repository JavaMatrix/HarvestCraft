package mods.harvestcraft;

import mods.harvestcraft.proxy.CommonProxy;
import mods.harvestcraft.seeds.TurnipSeeds;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
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
		
		// Most of the mod initialization goes here, like
		// instantiating the blocks and items, registering
		// handlers, adding localization, etc.
		
		Item turnipSeeds = new TurnipSeeds(1926);
		LanguageRegistry.addName(turnipSeeds, "Turnip Seeds");
		proxy.init();
	
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
