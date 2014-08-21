package com.anthro.letsmod.init;

import com.anthro.letsmod.item.ItemBase;
import com.anthro.letsmod.item.ItemMapleLeaf;
import com.anthro.letsmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author anthropomorphic
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ItemRegistry
{
  
  public static final ItemBase mapleLeaf = new ItemMapleLeaf();
  
  public static void init()
  {
    
    GameRegistry.registerItem(mapleLeaf, "mapleLeaf");
  }
}
