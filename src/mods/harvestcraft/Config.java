package mods.harvestcraft;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class Config {
	
	private static Configuration config;
	
	public static void load(File file) {
		
		config = new Configuration(file);
		config.load();
		
		// Load configuration here, like block
		// and item ids, as well as settings.
		
		config.save();
		
	}
	
}
