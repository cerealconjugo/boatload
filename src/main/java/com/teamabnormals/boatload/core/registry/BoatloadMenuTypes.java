package com.teamabnormals.boatload.core.registry;

import com.teamabnormals.boatload.client.gui.screens.inventory.FurnaceBoatScreen;
import com.teamabnormals.boatload.common.inventory.FurnaceBoatMenu;
import com.teamabnormals.boatload.core.Boatload;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BoatloadMenuTypes {
	public static final DeferredRegister<MenuType<?>> MENU_TYPES = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Boatload.MOD_ID);

	public static final RegistryObject<MenuType<FurnaceBoatMenu>> FURNACE_BOAT = MENU_TYPES.register("furnace_boat", () -> new MenuType<>(FurnaceBoatMenu::new, FeatureFlags.DEFAULT_FLAGS));

	public static void registerScreens() {
		MenuScreens.register(FURNACE_BOAT.get(), FurnaceBoatScreen::new);
	}
}