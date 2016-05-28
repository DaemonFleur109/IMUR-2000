package com.IMUR.Items;

import com.IMUR.CreativeTabs.IMURTabs;
import com.IMUR.Lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class V1ArmouredPlate {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
    
	public static Item V1AP;
	
	public static void initializeItem(){
		V1AP = new Item().setUnlocalizedName("V1AP").setCreativeTab(IMURTabs.tabItems).setTextureName(RefStrings.MODID + ":V1AP");
	}

    public static void registerItem(){
    	GameRegistry.registerItem(V1AP, V1AP.getUnlocalizedName());
    } 

}





