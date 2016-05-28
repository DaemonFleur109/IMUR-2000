package com.IMUR.CreativeTabs;

import com.IMUR.Blocks.VibraniumOre;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlocks extends CreativeTabs {

	public CreativeTabBlocks(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(VibraniumOre.VibOre);
	}

}
