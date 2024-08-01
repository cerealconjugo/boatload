package com.teamabnormals.boatload.client.gui.screens.inventory;

import com.teamabnormals.boatload.common.inventory.FurnaceBoatMenu;
import com.teamabnormals.boatload.core.Boatload;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FurnaceBoatScreen extends AbstractContainerScreen<FurnaceBoatMenu> {
	private static final ResourceLocation FURNACE_BOAT_GUI_TEXTURE = new ResourceLocation(Boatload.MOD_ID, "textures/gui/container/furnace_boat.png");

	public FurnaceBoatScreen(FurnaceBoatMenu menu, Inventory inventory, Component title) {
		super(menu, inventory, title);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {
		int x = this.leftPos;
		int y = this.topPos;
		guiGraphics.blit(FURNACE_BOAT_GUI_TEXTURE, x, y, 0, 0, this.imageWidth, this.imageHeight);
		if (this.menu.isLit()) {
			int k = this.menu.getLitProgress();
			guiGraphics.blit(FURNACE_BOAT_GUI_TEXTURE, x + 81, y + 19 + 12 - k, 176, 12 - k, 14, k + 1);
		}
	}

	@Override
	public void render(GuiGraphics guiGraphics, int partialTick, int mouseX, float mouseY) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, partialTick, mouseX, mouseY);
		this.renderTooltip(guiGraphics, partialTick, mouseX);
	}
}