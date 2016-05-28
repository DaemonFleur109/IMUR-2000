package com.IMUR.CreativeTabs;

import com.IMUR.Items.V1ArmouredPlate;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabArmour extends CreativeTabs {

	public CreativeTabArmour(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return V1ArmouredPlate.V1AP;
	}

}
