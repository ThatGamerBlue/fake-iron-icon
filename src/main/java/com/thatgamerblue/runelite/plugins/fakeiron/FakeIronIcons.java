package com.thatgamerblue.runelite.plugins.fakeiron;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public enum FakeIronIcons
{

	ORIGINAL_ICONS_PLACEHOLDER("--- Original ---", "", true, true),
	IRONMAN("Ironman", "", false, true),
	HCIM("Hardcore", "", false, true),
	ULTIMATE("Ultimate", "", false, true),
	CUSTOM_PLACEHOLDER("--- Custom ---", "", true, true),
	GREEN("Green", "green.png", false, true),
	PURPLE("Purple", "purple.png", false, true),
	PINK("Pink", "pink.png", false, true),
	ORANGE("Orange", "orange.png", false, true),
	CUSTOM("helm.png", "helm.png", false, false);

	private final String name;
	private final String imagePath;
	private final boolean header;
	private final boolean embedded;

	public String toString()
	{
		return name;
	}
}
