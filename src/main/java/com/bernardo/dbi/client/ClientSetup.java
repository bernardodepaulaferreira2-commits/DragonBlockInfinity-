package com.bernardo.dbi.client;

import com.bernardo.dbi.client.model.Dinossauro1Model;
import com.bernardo.dbi.client.render.Dinossauro1Renderer;
import com.bernardo.dbi.client.render.VelociraptorRenderer;
import com.bernardo.dbi.entity.Dinossauro1Entity;
import com.bernardo.dbi.entity.VelociraptorEntity;
import com.bernardo.dbi.registry.DBIEntities;
import com.bernardo.dbi.screen.CaracterScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.MinecraftClient;

public class ClientSetup implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        KeyBindings.initialize();

        // ── Registra os layers dos modelos de entidade ────────────────────────
        EntityModelLayerRegistry.registerModelLayer(
            Dinossauro1Model.LAYER,
            Dinossauro1Model::getTexturedModelData
        );

        // ── Registra renderers de entidade ────────────────────────────────────
        EntityRendererRegistry.register(DBIEntities.DINOSSAURO1, Dinossauro1Renderer::new);
        EntityRendererRegistry.register(DBIEntities.VELOCIRAPTOR, VelociraptorRenderer::new);
        //     VelociraptorEntity.TYPE,
        //     ctx -> new VelociraptorRenderer(ctx)
        // );
        // EntityRendererRegistry.register(
        //     Dinossauro1Entity.TYPE,
        //     ctx -> new Dinossauro1Renderer(ctx)
        // );

        // ── Tecla para abrir o menu ────────────────────────────────────────────
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (KeyBindings.OPEN_MENU.wasPressed()) {
                if (client.player != null) {
                    MinecraftClient.getInstance().setScreen(new CaracterScreen());
                }
            }
        });
    }
}