package com.thatgamerblue.runelite.plugins.fakeiron;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PluginRunner
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FakeIronPlugin.class);
		RuneLite.main(args);
	}
}