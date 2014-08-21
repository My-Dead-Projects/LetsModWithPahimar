package com.anthro.letsmod.block;

import com.anthro.letsmod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

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
  
  @Override
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister)
  {
    blockIcon = iconRegister.registerIcon(
        getUnwrappedUnlocalizedName(getUnlocalizedName())
    );
  }
  
  protected String getUnwrappedUnlocalizedName(String unlocalizedName)
  {
    return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
  }
}
