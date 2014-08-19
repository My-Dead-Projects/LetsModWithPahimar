package com.anthro.letsmod.config;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

/**
 * @author anthropomorphic
 */
public class ConfigHandler
{
  public static Configuration config;
  public static void init(File configFile)
  {
    config = new Configuration(configFile);
    
    try
    {
      config.load();
      
      boolean configValue = config.get
          (
              Configuration.CATEGORY_GENERAL,
              "configValue",
              true,
              "This is an example config value"
          ).getBoolean(true);
    }
    catch (Exception e)
    {
      
    }
    finally
    {
      config.save();
    }
  }
}
