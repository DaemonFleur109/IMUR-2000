package com.IMUR.CreativeTabs;

import com.IMUR.Items.JarvisConnectionChip;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabItems extends CreativeTabs {

	public CreativeTabItems(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return JarvisConnectionChip.JCC;
	}

}
