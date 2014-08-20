package com.anthro.letsmod.client.gui;

import cpw.mods.fml.client.IModGuiFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

import java.util.Set;

/**
 * @author anthropomorphic
 */
public class GuiFactory implements IModGuiFactory
{

  @Override
  public void initialize(Minecraft minecraftInstance)
  {
    /* unused method */
  }

  @Override
  public Class<? extends GuiScreen> mainConfigGuiClass()
  {
    return GuiConfig.class;
  }

  @Override
  public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
  {
    return null; /* unused method */
  }

  @Override
  public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
  {
    return null; /* unused method */
  }
}
