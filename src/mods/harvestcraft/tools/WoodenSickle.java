package mods.harvestcraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WoodenSickle extends Item {

        public WoodenSickle(int id) {
                super(id);	//???
                
                maxStackSize = 1;	//Tools do not stack.
                setCreativeTab(CreativeTabs.tabTools);	//Goes in tool tab
                setUnlocalizedName("Wooden Sickle"); //Name
        }
        
}

