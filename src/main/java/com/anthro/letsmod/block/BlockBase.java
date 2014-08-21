package com.anthro.letsmod.block;

import com.anthro.letsmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * @author anthropomorphic
 */
public class BlockBase extends Block
{
  protected BlockBase(Material material)
  {
    super(material);
  }
  
  @Override
  public String getUnlocalizedName()
  {
    return String.format(
        "item.%s:%s",
        Reference.MOD_ID.toLowerCase(),
        getUnwrappedUnlocalizedName(super.getUnlocalizedName())
    );
  }
  
  protected String getUnwrappedUnlocalizedName(String unlocalizedName)
  {
    return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
  }
}
