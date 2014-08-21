package com.anthro.letsmod.init;

import com.anthro.letsmod.block.BlockBase;
import com.anthro.letsmod.block.BlockFlag;
import com.anthro.letsmod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author anthropomorphic
 */
@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class BlockRegistry
{
  
  public static final BlockBase flag = new BlockFlag();
  
  public static void init()
  {
    GameRegistry.registerBlock(flag, "flag");
  }
}
