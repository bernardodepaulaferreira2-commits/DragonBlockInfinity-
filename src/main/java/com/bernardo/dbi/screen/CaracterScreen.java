package com.bernardo.dbi.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class CaracterScreen extends Screen {

    private static final Identifier MENU_TEXTURE = new Identifier("dragonblockinfinity", "textures/gui/menu.png");
    private static final int MENU_IMG_W = 510;
    private static final int MENU_IMG_H = 318;
    private static final int TEX_SIZE   = 512;

    private int xSize, ySize, guiLeft, guiTop;
    private float scaleX, scaleY;

    public CaracterScreen() {
        super(Text.empty());
    }

    @Override
    protected void init() {
        xSize   = MathHelper.floor(this.width * 0.75f);
        ySize   = MathHelper.floor(xSize * ((float) MENU_IMG_H / MENU_IMG_W));
        guiLeft = (this.width  - xSize) / 2;
        guiTop  = (this.height - ySize) / 2;
        scaleX  = (float) xSize / MENU_IMG_W;
        scaleY  = (float) ySize / MENU_IMG_H;
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);

        context.getMatrices().push();
        context.getMatrices().translate(guiLeft, guiTop, 0);
        context.getMatrices().scale(scaleX, scaleY, 1.0f);
        context.drawTexture(MENU_TEXTURE, 0, 0, 0, 0, MENU_IMG_W, MENU_IMG_H, TEX_SIZE, TEX_SIZE);
        context.getMatrices().pop();

        // Player: ocupa 60% da altura do menu, base alinhada a 90% da altura do menu
        int playerSize = MathHelper.floor(ySize * 0.60f);
        int playerX    = guiLeft + xSize / 4;
        int playerY    = guiTop  + MathHelper.floor(ySize * 0.90f);

        InventoryScreen.drawEntity(
                context,
                playerX, playerY,
                playerSize,
                (float)(playerX - mouseX),
                (float)(guiTop + ySize / 2 - mouseY),
                this.client.player
        );

        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPause() { return false; }
}
