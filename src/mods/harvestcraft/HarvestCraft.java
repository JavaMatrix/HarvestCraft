package mods.harvestcraft;

import mods.harvestcraft.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="HarvestCraft", version="Alpha 0.0.1", useMetadata=true)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class HarvestCraft {
	
	@Instance("HarvestCraft")
	public static HarvestCraft instance;
	
	@SidedProxy(clientSide="mods.harvestcraft.proxy.ClientProxy",
	            serverSide="mods.harvestcraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		Config.load(event.getSuggestedConfigurationFile());
		
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		
		// Most of the mod initialization goes here, like
		// instantiating the blocks and items, registering
		// handlers, adding localization, etc.
		// briddell stopped by, looked, and agrees
		// Sciguymjm thinks it's ok too
		// MiniUSB, also
		
		proxy.init();
		
	}
	
}
