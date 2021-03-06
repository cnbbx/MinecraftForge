package net.minecraftforge.fml.common.eventhandler;

import net.minecraftforge.fml.common.ModContainer;

//Instructs event handlers to set the active mod container.
//This has a major performance impact so use sparingly.
//Note: The context IS NOT thread aware as this would be ungodly slow.
//So This should ONLY be used for Forge mod lifecycle events.
public interface IContextSetter
{
    default void setModContainer(ModContainer mod){};
}
