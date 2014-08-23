package com.anthro.letsmod.client.handler;

import com.anthro.letsmod.client.settings.KeyBindings;
import com.anthro.letsmod.reference.Key;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * @author anthropomorphic
 */
public class KeyInputEventHandler
{
  private static Key getPressedKeyBinding()
  {
    if (KeyBindings.charge.isPressed())
    {
      return Key.CHARGE;
    }
    if (KeyBindings.release.isPressed())
    {
      return Key.RELEASE;
    }
    return Key.UNKNOWN;
  }
  
  @SubscribeEvent
  public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
  {
    
  }
}
