package com.bittim.bitmod.block.alloy_furnace;

import com.bittim.bitmod.BitMod;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class AlloyFurnaceScreen extends ContainerScreen<AlloyFurnaceContainer>
{
    public static final ResourceLocation TEXTURE = new ResourceLocation(BitMod.MOD_ID, "textures/gui/container/alloy_furnace_gui.png");

    public AlloyFurnaceScreen(AlloyFurnaceContainer container, PlayerInventory playerInventory, ITextComponent title) {
        super(container, playerInventory, title);
    }

    @Override
    public void render(MatrixStack matrixStack, int x, int y, float partialTicks)
    {
        this.renderBackground(matrixStack);
        super.render(matrixStack, x, y, partialTicks);
        this.renderTooltip(matrixStack, x, y);
    }

    @Override
    @SuppressWarnings("deprecation")
    protected void renderBg(MatrixStack matrixStack, float partialTicks, int x, int y)
    {
        if(minecraft == null) return;

        RenderSystem.color4f(1f, 1f, 1f, 1f);
        minecraft.getTextureManager().bind(TEXTURE);

        int posX = (this.width - this.imageWidth) / 2;
        int posY = (this.height - this.imageHeight) / 2;

        this.blit(matrixStack, posX, posY, 0, 0, this.imageWidth, this.imageHeight);

        //Progress Arrow
        this.blit(matrixStack, posX + 60, posY + 34, 176, 14, menu.getProgressArrowScale() + 1, 18);

        //Fuel Burn
        int fuelBurnScale = menu.getFuelBurnScale();
        this.blit(matrixStack, posX + 8, posY + 36 + 13 - fuelBurnScale, 176, 13 - fuelBurnScale, 14, fuelBurnScale + 1);
    }
}
