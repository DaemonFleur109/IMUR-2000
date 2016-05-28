package com.IMUR.Main;

import com.IMUR.Armour.ArmourVeronica;
import com.IMUR.Blocks.PalladiumOre;
import com.IMUR.Blocks.PlatinumOre;
import com.IMUR.Blocks.VibraniumOre;
import com.IMUR.CreativeTabs.IMURTabs;
import com.IMUR.Items.JarvisConnectionChip;
import com.IMUR.Items.Palladium;
import com.IMUR.Items.RawPalladium;
import com.IMUR.Items.V1ArmouredPlate;
import com.IMUR.Lib.RefStrings;
import com.IMUR.World.OreGenerations;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = RefStrings.MODID , name = RefStrings.NAME , version = RefStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE , serverSide = RefStrings.SERVERSIDE)
    public static ServerProxy proxy;
    
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {
		IMURTabs.initializeTabs();
		V1ArmouredPlate.mainRegistry();
		JarvisConnectionChip.mainRegistry();
		PalladiumOre.mainRegistry();
		Palladium.mainRegistry();
		VibraniumOre.mainRegistry();
		PlatinumOre.mainRegistry();
		RawPalladium.mainRegistry();
		OreGenerations.mainRegistry();
		CraftingManager.mainRegistry();
		proxy.registerRenderInfo();

	}
	@EventHandler
	public static void Load(FMLInitializationEvent event){
	
	
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent) {
		MinecraftForge.EVENT_BUS.register(new ArmouredEventHandler());
	
	}	
    @EventHandler
    public void pre_init(FMLPreInitializationEvent event) {
    	
	    ArmorMaterial Veronica = EnumHelper.addArmorMaterial("Veronica", 120, new int[]{250, 550, 500, 300}, 10);
		
		Item VeroHelmet = new ArmourVeronica(Veronica, 1, 0).setUnlocalizedName("VeroHelmet");
		Item VeroChassis = new ArmourVeronica(Veronica, 1, 1).setUnlocalizedName("VeroChassis");
		Item VeroLegs = new ArmourVeronica(Veronica, 1, 2).setUnlocalizedName("VeroLegs");
		Item VeroBoots = new ArmourVeronica(Veronica, 1, 3).setUnlocalizedName("VeroBoots");
		
		GameRegistry.registerItem(VeroHelmet, "VeroHelmet");
		GameRegistry.registerItem(VeroChassis, "VeroChassis");
		GameRegistry.registerItem(VeroLegs, "VeroLegs");
		GameRegistry.registerItem(VeroBoots, "VeroBoots");
    	
    	
    	
    }
		
	

}
