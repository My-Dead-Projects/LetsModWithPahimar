package com.anthro.letsmod.handler;

import com.anthro.letsmod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;

/**
 * @author anthropomorphic
 */
public class ConfigHandler
{
  public static Configuration config;
  
  public static boolean testValue = false;
  
  public static void init(File configFile)
  {
    if (config == null)
    {
      config = new Configuration(configFile);
      syncConfig();
    }
  }
  
  @SubscribeEvent
  public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent e)
  {
    if (e.modID.equalsIgnoreCase(Reference.MOD_ID))
    {
      syncConfig();
    }
  }
  
  private static void syncConfig()
  {
    testValue = config.getBoolean(
        "testValue",
        Configuration.CATEGORY_GENERAL,
        false, //
        "This is a test config value"
    );
    
    if (config.hasChanged())
    {
      config.save();
    }
  }
}
