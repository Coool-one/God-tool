
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.godtool.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.godtool.GodToolMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class GodToolModTabs {
	public static ResourceKey<CreativeModeTab> TAB_GODTOOLS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(GodToolMod.MODID, "godtools"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_GODTOOLS, FabricItemGroup.builder().title(Component.translatable("item_group." + GodToolMod.MODID + ".godtools")).icon(() -> new ItemStack(GodToolModItems.GODTOOL)).build());
	}
}
