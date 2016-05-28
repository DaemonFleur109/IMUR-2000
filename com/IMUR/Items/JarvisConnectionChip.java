package com.IMUR.Items;

import com.IMUR.CreativeTabs.IMURTabs;
import com.IMUR.Lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class JarvisConnectionChip {

	public static void mainRegistry(){
		initializeItem();
		registerItem();
	}
    
	public static Item JCC;
	
	public static void initializeItem(){
		JCC = new Item().setUnlocalizedName("JCC").setCreativeTab(IMURTabs.tabItems).setTextureName(RefStrings.MODID + ":JCC");
	}

    public static void registerItem(){
    	GameRegistry.registerItem(JCC, JCC.getUnlocalizedName());
    } 

}
