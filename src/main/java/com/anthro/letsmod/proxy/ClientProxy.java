package com.anthro.letsmod.proxy;

import com.anthro.letsmod.client.settings.KeyBindings;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * @author anthropomorphic
 */
public class ClientProxy extends CommonProxy
{
  @Override
  public void registerKeyBindings()
  {
    ClientRegistry.registerKeyBinding(KeyBindings.charge);
    ClientRegistry.registerKeyBinding(KeyBindings.release);
  }
}
