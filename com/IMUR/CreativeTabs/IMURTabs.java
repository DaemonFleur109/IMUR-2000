package com.IMUR.CreativeTabs;

import net.minecraft.creativetab.CreativeTabs;

public class IMURTabs {

	public static CreativeTabs tabBlocks;
	public static CreativeTabs tabItems;
	public static CreativeTabs tabArmour;
	
	
	public static void initializeTabs(){
		tabBlocks = new CreativeTabBlocks("BlockTab");
		tabItems = new CreativeTabItems("ItemsTab");
		tabArmour = new CreativeTabArmour("ArmourTab");
	}
}
