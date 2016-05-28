package com.IMUR.Main;

import java.util.HashMap;
import java.util.Map;

import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;

public class ClientProxy extends ServerProxy {
	
	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
	
	public void registerRenderInfo(){
		
	 }
    public int addArmor(String armor){
        return RenderingRegistry.addNewArmourRendererPrefix(armor);	
    }
} 

