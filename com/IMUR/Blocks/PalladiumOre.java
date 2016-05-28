package com.IMUR.Blocks;

import com.IMUR.CreativeTabs.IMURTabs;
import com.IMUR.Lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PalladiumOre {

	public static void mainRegistry(){
		initializeBlock();
		registerItem();
	}
	
	public static Block PallOre;
	
	public static void initializeBlock(){
		PallOre = new PallOre(Material.iron).setBlockName("PallOre").setCreativeTab(IMURTabs.tabBlocks).setBlockTextureName(RefStrings.MODID + ":PallOre");
	}

    public static void registerItem(){
    	GameRegistry.registerBlock(PallOre, PallOre.getUnlocalizedName());
    } 

}
