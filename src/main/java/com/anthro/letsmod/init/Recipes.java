package com.anthro.letsmod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * @author anthropomorphic
 */
public class Recipes
{
  public static void init()
  {
    GameRegistry.addRecipe(
        new ShapedOreRecipe(
            new ItemStack(ItemRegistry.mapleLeaf),
            " s ",
            "sss",
            " s ",
            's', new ItemStack(Items.reeds)
        )
    );
    
    GameRegistry.addRecipe(
        new ShapedOreRecipe(
            new ItemStack(BlockRegistry.flag),
            "ms ",
            " s ",
            " s ",
            'm', new ItemStack(ItemRegistry.mapleLeaf),
            's', "stickWood"
        )
    );
  }
}
