package com.ignis.bard.items;

import net.minecraft.item.Item ; 

public class Instrument extends Item { 
  public static void newItem(int maxStack, CreativeTabs tab, int texture, String unlocalizedName) {
    setMaxStackSize (maxStack) ; 
    setCreativeTab (tab) ; 
    setUnlocalizedName (unlocalizedName) ;
  }
}
