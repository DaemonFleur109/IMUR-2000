package com.IMUR.Items;

import com.IMUR.CreativeTabs.IMURTabs;
import com.IMUR.Lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RawPalladium {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
    
	public static Item RawPall;
	
	public static void initializeItem(){
		RawPall = new Item().setUnlocalizedName("RawPall").setCreativeTab(IMURTabs.tabItems).setTextureName(RefStrings.MODID + ":RawPall");
	}

    public static void registerItem(){
    	GameRegistry.registerItem(RawPall, RawPall.getUnlocalizedName());
    } 

}
