package com.IMUR.Blocks;

import com.IMUR.CreativeTabs.IMURTabs;
import com.IMUR.Lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PlatinumOre {

	public static void mainRegistry(){
		initializeBlock();
		registerItem();
	}
	
	public static Block PlatOre;
	
	public static void initializeBlock(){
		PlatOre = new PallOre(Material.iron).setBlockName("PlatOre").setCreativeTab(IMURTabs.tabBlocks).setBlockTextureName(RefStrings.MODID + ":PlatOre");
	}

    public static void registerItem(){
    	GameRegistry.registerBlock(PlatOre, PlatOre.getUnlocalizedName());
    } 

}
