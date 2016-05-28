package com.IMUR.Armour;

import com.IMUR.CreativeTabs.IMURTabs;
import com.IMUR.Lib.RefStrings;
import com.IMUR.Lib.Resource;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmourVeronica extends ItemArmor{

	public ArmourVeronica(ArmorMaterial material, int render_idx, int type) {
		super(material, render_idx, type);
	    
		this.setMaxStackSize(1);
		this.setCreativeTab(IMURTabs.tabArmour);
	}
	@Override
	public String getUnlocalizedName(){
		return String.format("item.%s%s", Resource.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack){
		return String.format("item.%s%s", Resource.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));

	}
    
	protected String getUnwrappedUnlocalizedName(String unlocalizedName){
		return unlocalizedName.substring(unlocalizedName.indexOf('_') + 1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconregister){
		this.itemIcon = iconregister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf('_')));
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		
		String name = this.getUnwrappedUnlocalizedName(super.getUnlocalizedName());
		name = name.substring(0, name.indexOf('_'));
		
		
		return String.format("textures/armor/Vero1.png", RefStrings.MODID, name, slot == 2 ? 2 : 1);
		
	}

}