package com.IMUR.World;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreGenerations {
    public static void mainRegistry(){
    	initializeWorldGen();
    }
    
    public static void initializeWorldGen(){
    	registerWorldGen(new IMUROre(), 1);
    }

    public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
    	GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
    }

}
