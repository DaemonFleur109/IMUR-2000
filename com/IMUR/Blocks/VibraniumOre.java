package com.IMUR.Blocks;

import com.IMUR.CreativeTabs.IMURTabs;
import com.IMUR.Lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class VibraniumOre {

	public static void mainRegistry(){
		initializeBlock();
		registerItem();
	}
	
	public static Block VibOre;
	
	public static void initializeBlock(){
		VibOre = new PallOre(Material.iron).setBlockName("VibOre").setCreativeTab(IMURTabs.tabBlocks).setBlockTextureName(RefStrings.MODID + ":VibOre");
	}

    public static void registerItem(){
    	GameRegistry.registerBlock(VibOre, VibOre.getUnlocalizedName());
    } 

}
