package com.anthro.letsmod.item;

import com.anthro.letsmod.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * @author anthropomorphic
 */
public class ItemBase extends Item
{
  public ItemBase()
  {
    super();
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
  
  @Override
  public String getUnlocalizedName(ItemStack itemStack)
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
