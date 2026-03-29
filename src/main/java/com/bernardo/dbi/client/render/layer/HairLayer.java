package com.bernardo.dbi.client.render.layer;

import com.bernardo.dbi.client.render.DBIPlayerModel;
import com.bernardo.dbi.player.DBIPlayerData;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class HairLayer extends FeatureRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> {

    private final DBIPlayerModel<AbstractClientPlayerEntity> hairModel;

    public HairLayer(FeatureRendererContext<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>> ctx) {
        super(ctx);
        this.hairModel = new DBIPlayerModel<>(
            DBIPlayerModel.getTexturedModelData().createModel()
        );
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers,
                       int light, AbstractClientPlayerEntity player,
                       float limbAngle, float limbDistance,
                       float tickDelta, float animationProgress,
                       float headYaw, float headPitch) {

        Identifier texture = DBIPlayerData.getHairTexture(player);
        if (texture == null) return;

        // Não renderiza o hair_base como cabelo externo; ele é parte de base interna.
        if (texture.getPath().endsWith("hair_base.png")) return;

        // Sincroniza o modelo com as animações do player
        hairModel.setAngles(player, limbAngle, limbDistance, animationProgress, headYaw, headPitch);
        hairModel.handSwingProgress = getContextModel().handSwingProgress;
        hairModel.riding = getContextModel().riding;
        hairModel.child = getContextModel().child;

        // RenderLayer.getEntityCutoutNoCull para transparência sem distorção
        var vertexConsumer = vertexConsumers.getBuffer(RenderLayer.getEntityCutoutNoCull(texture));
        
        // Renderiza só o cabelo (head) - evita sobreposição de hat em cima
        hairModel.head.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 1f, 1f, 1f, 1f);
    }
}
