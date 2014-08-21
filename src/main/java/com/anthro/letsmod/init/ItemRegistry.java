package com.anthro.letsmod.init;

import com.anthro.letsmod.item.ItemBase;
import com.anthro.letsmod.item.ItemMapleLeaf;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author anthropomorphic
 */
public class ItemRegistry
{
  
  public static final ItemBase mapleLeaf = new ItemMapleLeaf();
  
  public static void init()
  {
    
    GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
  }
}
