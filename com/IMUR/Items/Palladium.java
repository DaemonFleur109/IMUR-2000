package com.IMUR.Items;

import com.IMUR.CreativeTabs.IMURTabs;
import com.IMUR.Lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Palladium {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
    
	public static Item Pall;
	
	public static void initializeItem(){
		Pall = new Item().setUnlocalizedName("Pall").setCreativeTab(IMURTabs.tabItems).setTextureName(RefStrings.MODID + ":Pall");
	}

    public static void registerItem(){
    	GameRegistry.registerItem(Pall, Pall.getUnlocalizedName());
    } 

}
