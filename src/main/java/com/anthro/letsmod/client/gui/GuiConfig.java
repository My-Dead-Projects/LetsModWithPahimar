package com.anthro.letsmod.client.gui;

import com.anthro.letsmod.handler.ConfigHandler;
import com.anthro.letsmod.reference.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;


/**
 * @author anthropomorphic
 */
public class GuiConfig extends cpw.mods.fml.client.config.GuiConfig
{
  public GuiConfig(GuiScreen guiScreen)
  {
    super (
        guiScreen,
        new ConfigElement<ConfigCategory>
            (ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL))
            .getChildElements(),
        Reference.MOD_ID,
        false, /* requires world restart */
        false, /* requires Minecraft restart */
        Reference.MOD_NAME
    );
  }
}
