package com.anthro.letsmod.client.settings;

import com.anthro.letsmod.reference.Reference;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

/**
 * @author anthropomorphic
 */
public class KeyBindings
{
  public static KeyBinding charge = new KeyBinding(Reference.KeyBindingName.CHARGE, Keyboard.KEY_C, Reference.MOD_NAME);
  public static KeyBinding release = new KeyBinding(Reference.KeyBindingName.RELEASE, Keyboard.KEY_R, Reference.MOD_NAME);
}
