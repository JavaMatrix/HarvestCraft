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
	public static ItemSeeds TurnipSeeds;
	public static Item Turnip;
	public static Block TurnipPlant;
	public static ItemSeeds TomatoSeeds;
	public static Item Tomato;
	public static Block TomatoPlant;
	public static ItemSeeds OnionSeeds;
	public static Item Onion;
	public static ItemSeeds WheatSeeds;
	public static Item Wheat;
	public static ItemSeeds PotatoSeeds;
	public static Item Potato;
	public static ItemSeeds CarrotSeeds;
	public static Item Carrot;
	public static ItemSeeds FlaxSeeds;
	public static Item Flax;
	public static ItemSeeds StrawberrySeeds;
	public static Item Strawberry;
	public static ItemSeeds CacaoSeeds;
	public static Item Cacao;
	public static ItemSeeds CabbageSeeds;
	public static Item Cabbage;
	public static ItemSeeds ChiliPepperSeeds;
	public static Item ChiliPepper;
	public static ItemSeeds LettuceSeeds;
	public static Item Lettuce;
	public static ItemSeeds CornSeeds;
	public static Item Corn;
	public static ItemSeeds HoneydewSeeds;
	public static Item Honeydew;
	public static ItemSeeds WatermelonSeeds;
	public static Item Watermelon;
	public static ItemSeeds RiceSeeds;
	public static Item Rice;
	public static ItemSeeds CucumberSeeds;
	public static Item Cucumber;
	public static ItemSeeds SugarCaneSeeds;
	public static Item SugarCane;
	public static ItemSeeds EggplantSeeds;
	public static Item Eggplant;
	public static ItemSeeds PepperSeeds;
	public static Item Pepper;
	public static ItemSeeds YamSeeds;
	public static Item Yam;
	public static ItemSeeds SpinachSeeds;
	public static Item Spinach;
	public static ItemSeeds GrapeSeeds;
	public static Item Grape;
	public static ItemSeeds BuckwheatSeeds;
	public static Item Buckwheat;
	public static ItemSeeds PineappleSeeds;
	public static Item Pineapple;
	public static ItemSeeds SweetPotatoSeeds;
	public static Item SweetPotato;
	public static Block OnionPlant;
	public static Block WheatPlant;
	public static Block PotatoPlant;
	public static Block CarrotPlant;
	public static Block FlaxPlant;
	public static Block StrawberryPlant;
	public static Block CacaoPlant;
	public static Block CabbagePlant;
	public static Block ChiliPepperPlant;
	public static Block LettucePlant;
	public static Block CornPlant;
	public static Block HoneydewPlant;
	public static Block WatermelonPlant;
	public static Block RicePlant;
	public static Block CucumberPlant;
	public static Block SugarCanePlant;
	public static Block EggplantPlant;
	public static Block PepperPlant;
	public static Block YamPlant;
	public static Block SpinachPlant;
	public static Block GrapePlant;
	public static Block BuckwheatPlant;
	public static Block PineapplePlant;
	public static Block SweetPotatoPlant;

	
	
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
		TurnipPlant = new TurnipPlant(500);
		TomatoPlant = new TomatoPlant(501);
		OnionPlant = new OnionPlant(502);
		WheatPlant = new WheatPlant(503);
		PotatoPlant = new PotatoPlant(504);
		CarrotPlant = new CarrotPlant(505);
		FlaxPlant = new FlaxPlant(506);
		StrawberryPlant = new StrawberryPlant(507);
		CacaoPlant = new CacaoPlant(508);
		CabbagePlant = new CabbagePlant(509);
		ChiliPepperPlant = new ChiliPepperPlant(510);
		LettucePlant = new LettucePlant(511);
		CornPlant = new CornPlant(512);
		HoneydewPlant = new HoneydewPlant(513);
		WatermelonPlant = new WatermelonPlant(514);
		RicePlant = new RicePlant(515);
		CucumberPlant = new CucumberPlant(516);
		SugarCanePlant = new SugarCanePlant(517);
		EggplantPlant = new EggplantPlant(518);
		PepperPlant = new PepperPlant(519);
		YamPlant = new YamPlant(520);
		RicePlant = new RicePlant(521);
		SpinachPlant = new SpinachPlant(522);
		GrapePlant = new GrapePlant(523);
		BuckwheatPlant = new BuckwheatPlant(524);
		PineapplePlant = new PineapplePlant(525);
		SweetPotatoPlant = new SweetPotatoPlant(526);
		
		//Item Declarations
		Turnip = new Turnip(5002, 4, 3.0F);
		Tomato = new Tomato(5004, 4, 3.0F);
		Onion = new Onion(5006, 4, 3.0F);
		Wheat = new Wheat(5008, 4, 3.0F);
		Potato = new Potato(5010, 4, 3.0F);
		Carrot = new Carrot(5012, 4, 3.0F);
		Flax = new Flax(5014, 4, 3.0F);
		Strawberry = new Strawberry(5016, 4, 3.0F);
		Cacao = new Cacao(5018, 4, 3.0F);
		Cabbage = new Cabbage(5020, 4, 3.0F);
		ChiliPepper = new ChiliPepper(5022, 4, 3.0F);
		Lettuce = new Lettuce(5024, 4, 3.0F);
		Corn = new Corn(5026, 4, 3.0F);
		Honeydew = new Honeydew(5028, 4, 3.0F);
		Watermelon = new Watermelon(5030, 4, 3.0F);
		Rice = new Rice(5032, 4, 3.0F);
		Cucumber = new Cucumber(5034, 4, 3.0F);
		SugarCane = new SugarCane(5036, 4, 3.0F);
		Eggplant = new Eggplant(5038, 4, 3.0F);
		Pepper = new Pepper(5040, 4, 3.0F);
		Yam = new Yam(5042, 4, 3.0F);
		Spinach = new Spinach(5044, 4, 3.0F);
		Grape = new Grape(5046, 4, 3.0F);
		Buckwheat = new Buckwheat(5048, 4, 3.0F);
		Pineapple = new Pineapple(5050, 4, 3.0F);
		SweetPotato = new SweetPotato(5052, 4, 3.0F);
		
		
		TurnipSeeds = new TurnipSeeds(5001, TurnipPlant.blockID, Block.tilledField.blockID);
		TomatoSeeds = new TomatoSeeds(5003, TomatoPlant.blockID, Block.tilledField.blockID);		
		OnionSeeds = new OnionSeeds(5005, OnionPlant.blockID, Block.tilledField.blockID);
		WheatSeeds = new WheatSeeds(5007, WheatPlant.blockID, Block.tilledField.blockID);
		PotatoSeeds = new PotatoSeeds(5009, PotatoPlant.blockID, Block.tilledField.blockID);
		CarrotSeeds = new CarrotSeeds(5011, CarrotPlant.blockID, Block.tilledField.blockID);
		FlaxSeeds = new FlaxSeeds(5013, FlaxPlant.blockID, Block.tilledField.blockID);
		StrawberrySeeds = new StrawberrySeeds(5015, StrawberryPlant.blockID, Block.tilledField.blockID);
		CacaoSeeds = new CacaoSeeds(5017, CacaoPlant.blockID, Block.tilledField.blockID);
		CabbageSeeds = new CabbageSeeds(5019, CabbagePlant.blockID, Block.tilledField.blockID);
		ChiliPepperSeeds = new ChiliPepperSeeds(5021, ChiliPepperPlant.blockID, Block.tilledField.blockID);
		LettuceSeeds = new LettuceSeeds(5023, LettucePlant.blockID, Block.tilledField.blockID);
		CornSeeds = new CornSeeds(5025, CornPlant.blockID, Block.tilledField.blockID);
		HoneydewSeeds = new HoneydewSeeds(5027, HoneydewPlant.blockID, Block.tilledField.blockID);
		WatermelonSeeds = new WatermelonSeeds(5029, WatermelonPlant.blockID, Block.tilledField.blockID);
		RiceSeeds = new RiceSeeds(5031, RicePlant.blockID, Block.tilledField.blockID);
		CucumberSeeds = new CucumberSeeds(5033, CucumberPlant.blockID, Block.tilledField.blockID);
		SugarCaneSeeds = new SugarCaneSeeds(5035, SugarCanePlant.blockID, Block.tilledField.blockID);
		EggplantSeeds = new EggplantSeeds(5037, EggplantPlant.blockID, Block.tilledField.blockID);
		PepperSeeds = new PepperSeeds(5039, PepperPlant.blockID, Block.tilledField.blockID);
		YamSeeds = new YamSeeds(5041, YamPlant.blockID, Block.tilledField.blockID);
		SpinachSeeds = new SpinachSeeds(5043, SpinachPlant.blockID, Block.tilledField.blockID);
		GrapeSeeds = new GrapeSeeds(5045, GrapePlant.blockID, Block.tilledField.blockID);
		BuckwheatSeeds = new BuckwheatSeeds(5047, BuckwheatPlant.blockID, Block.tilledField.blockID);
		PineappleSeeds = new PineappleSeeds(5049, PineapplePlant.blockID, Block.tilledField.blockID);
		SweetPotatoSeeds = new SweetPotatoSeeds(5051, SweetPotatoPlant.blockID, Block.tilledField.blockID);

		//Language Registry
		LanguageRegistry.addName(TurnipSeeds, "Turnip Seeds");
		LanguageRegistry.addName(Turnip, "Turnip");
		LanguageRegistry.addName(TomatoSeeds, "Tomato Seeds");
		LanguageRegistry.addName(Tomato, "Tomato");
		LanguageRegistry.addName(OnionSeeds, "Onion Seeds");
		LanguageRegistry.addName(Onion, "Onion");
		LanguageRegistry.addName(WheatSeeds, "Wheat Seeds");
		LanguageRegistry.addName(Wheat, "Wheat");
		LanguageRegistry.addName(PotatoSeeds, "Potato Seeds");
		LanguageRegistry.addName(Potato, "Potato");
		LanguageRegistry.addName(CarrotSeeds, "Carrot Seeds");
		LanguageRegistry.addName(Carrot, "Carrot");
		LanguageRegistry.addName(FlaxSeeds, "Flax Seeds");
		LanguageRegistry.addName(Flax, "Flax");
		LanguageRegistry.addName(StrawberrySeeds, "Strawberry Seeds");
		LanguageRegistry.addName(Strawberry, "Strawberry");
		LanguageRegistry.addName(CacaoSeeds, "Cacao Seeds");
		LanguageRegistry.addName(Cacao, "Cacao");
		LanguageRegistry.addName(CabbageSeeds, "Cabbage Seeds");
		LanguageRegistry.addName(Cabbage, "Cabbage");
		LanguageRegistry.addName(ChiliPepperSeeds, "ChiliPepper Seeds");
		LanguageRegistry.addName(ChiliPepper, "ChiliPepper");
		LanguageRegistry.addName(LettuceSeeds, "Lettuce Seeds");
		LanguageRegistry.addName(Lettuce, "Lettuce");
		LanguageRegistry.addName(CornSeeds, "Corn Seeds");
		LanguageRegistry.addName(Corn, "Corn");
		LanguageRegistry.addName(HoneydewSeeds, "Honeydew Seeds");
		LanguageRegistry.addName(Honeydew, "Honeydew");
		LanguageRegistry.addName(WatermelonSeeds, "Watermelon Seeds");
		LanguageRegistry.addName(Watermelon, "Watermelon");
		LanguageRegistry.addName(RiceSeeds, "Rice Seeds");
		LanguageRegistry.addName(Rice, "Rice");
		LanguageRegistry.addName(CucumberSeeds, "Cucumber Seeds");
		LanguageRegistry.addName(Cucumber, "Cucumber");
		LanguageRegistry.addName(SugarCaneSeeds, "SugarCane Seeds");
		LanguageRegistry.addName(SugarCane, "SugarCane");
		LanguageRegistry.addName(EggplantSeeds, "Eggplant Seeds");
		LanguageRegistry.addName(Eggplant, "Eggplant");
		LanguageRegistry.addName(PepperSeeds, "Pepper Seeds");
		LanguageRegistry.addName(Pepper, "Pepper");
		LanguageRegistry.addName(YamSeeds, "Yam Seeds");
		LanguageRegistry.addName(Yam, "Yam");
		LanguageRegistry.addName(SpinachSeeds, "Spinach Seeds");
		LanguageRegistry.addName(Spinach, "Spinach");
		LanguageRegistry.addName(GrapeSeeds, "Grape Seeds");
		LanguageRegistry.addName(Grape, "Grape");
		LanguageRegistry.addName(BuckwheatSeeds, "Buckwheat Seeds");
		LanguageRegistry.addName(Buckwheat, "Buckwheat");
		LanguageRegistry.addName(PineappleSeeds, "Pineapple Seeds");
		LanguageRegistry.addName(Pineapple, "Pineapple");
		LanguageRegistry.addName(SweetPotatoSeeds, "SweetPotato Seeds");
		LanguageRegistry.addName(SweetPotato, "SweetPotato");
		
		//Other Hook Needs
		
		
		proxy.init();
	
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
}
