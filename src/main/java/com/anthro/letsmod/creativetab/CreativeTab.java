package com.anthro.letsmod.creativetab;

import com.anthro.letsmod.init.ItemRegistry;
import com.anthro.letsmod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * @author anthropomorphic
 */
public class CreativeTab
{
  public static final CreativeTabs LETS_MOD_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
  {
    @Override
    public Item getTabIconItem()
    {
      return ItemRegistry.mapleLeaf;
    }
  };
}
