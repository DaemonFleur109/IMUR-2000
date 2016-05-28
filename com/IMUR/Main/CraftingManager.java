package com.IMUR.Main;

import com.IMUR.Blocks.PalladiumOre;
import com.IMUR.Items.RawPalladium;
import com.IMUR.Items.V1ArmouredPlate;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingManager {
   public static void mainRegistry(){
	   addCraftingRec();
	   addSmeltingRec();
   }

   public static void addCraftingRec(){
	   //Shaped
	   GameRegistry.addRecipe(new ItemStack(V1ArmouredPlate.V1AP, 1), new Object[]{"  X", " XX", "XXX", 'X', Items.iron_ingot});
	   //Shapeless
	   
	   
   }
 
   public static void addSmeltingRec(){
	   
	   
   } 
}
