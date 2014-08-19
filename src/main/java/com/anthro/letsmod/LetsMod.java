package com.anthro.letsmod;

import com.anthro.letsmod.proxy.IProxy;
import com.anthro.letsmod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author anthropomorphic
 */
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class LetsMod
{  
  @Mod.Instance("LetsMod")
  public static LetsMod instance;
  
  @SidedProxy
  (
      clientSide = "com.anthro.letsmod.proxy.ClientProxy",
      serverSide = "com.anthro.letsmod.proxy.ServerProxy"
  )
  public static IProxy proxy;
  
  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent e)
  {
    
  }
  
  @Mod.EventHandler
  public void init(FMLInitializationEvent e)
  {
    
  }
  
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent e)
  {
    
  }
}
