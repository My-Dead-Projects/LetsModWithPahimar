package com.anthro.letsmod;

import com.anthro.letsmod.handler.ConfigHandler;
import com.anthro.letsmod.init.BlockRegistry;
import com.anthro.letsmod.init.ItemRegistry;
import com.anthro.letsmod.init.Recipes;
import com.anthro.letsmod.proxy.IProxy;
import com.anthro.letsmod.reference.Reference;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author anthropomorphic
 */
@Mod(
    modid = Reference.MOD_ID,
    name = Reference.MOD_NAME,
    version = Reference.VERSION,
    guiFactory = Reference.GUI_FACTORY_CLASS
)
public class LetsMod
{  
  @Mod.Instance("LetsMod")
  public static LetsMod instance;
  
  @SidedProxy
  (
      clientSide = Reference.CLIENT_PROXY_CLASS,
      serverSide = Reference.SERVER_PROXY_CLASS
  )
  public static IProxy proxy;
  
  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent e)
  {
    ConfigHandler.init(e.getSuggestedConfigurationFile());
    FMLCommonHandler.instance().bus().register(new ConfigHandler());
    ItemRegistry.init();
    BlockRegistry.init();
    proxy.registerKeyBindings();
  }
  
  @Mod.EventHandler
  public void init(FMLInitializationEvent e)
  {
    Recipes.init();
  }
  
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent e)
  {
    
  }
}
