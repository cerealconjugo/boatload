package com.teamabnormals.boatload.common.inventory;

import net.minecraft.world.Container;
import net.minecraft.world.inventory.FurnaceFuelSlot;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;

public class FurnaceBoatSlot extends Slot {
	private final FurnaceBoatMenu menu;

	public FurnaceBoatSlot(FurnaceBoatMenu menu, Container container, int slot, int x, int y) {
		super(container, slot, x, y);
		this.menu = menu;
	}

	public boolean mayPlace(ItemStack stack) {
		return this.menu.isFuel(stack) || FurnaceFuelSlot.isBucket(stack);
	}

	public int getMaxStackSize(ItemStack stack) {
		return FurnaceFuelSlot.isBucket(stack) ? 1 : super.getMaxStackSize(stack);
	}
}