package com.bernardo.dbi.client.render;

import net.minecraft.client.model.*;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.entity.LivingEntity;

public class DBIPlayerModel<T extends LivingEntity> extends BipedEntityModel<T> {

    // Usando tamanho padrão do Minecraft (64x64)
    // As camadas (hair, eyes, etc) serão texturas 2D customizadas
    public static final int TEX_W = 64;
    public static final int TEX_H = 64;

    public DBIPlayerModel(ModelPart root) {
        super(root);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData root = modelData.getRoot();

        // HEAD — tamanho e UV padrão com melhor mapeamento para customizações
        ModelPartData head = root.addChild(EntityModelPartNames.HEAD,
            ModelPartBuilder.create()
                // Face principal (olhos, nariz, boca)
                .uv(0, 0).cuboid(-4, -8, -4, 8, 8, 8, new Dilation(0f))
                // Adicionar partes específicas para melhor mapeamento de texturas
                .uv(32, 0).cuboid(-4, -8, -4, 8, 8, 0, new Dilation(0.01f)), // Face overlay
            ModelTransform.pivot(0, 0, 0));

        // HAT — com overlay para cabelos e acessórios
        root.addChild(EntityModelPartNames.HAT,
            ModelPartBuilder.create()
                .uv(32, 0).cuboid(-4, -8, -4, 8, 8, 8, new Dilation(0.5f))
                // Overlay adicional para cabelos
                .uv(0, 32).cuboid(-4, -8, -4, 8, 8, 0, new Dilation(0.51f)),
            ModelTransform.pivot(0, 0, 0));

        // BODY — torso
        root.addChild(EntityModelPartNames.BODY,
            ModelPartBuilder.create()
                .uv(16, 16).cuboid(-4, 0, -2, 8, 12, 4, new Dilation(0f)),
            ModelTransform.pivot(0, 0, 0));

        // RIGHT_ARM — braço direito
        root.addChild(EntityModelPartNames.RIGHT_ARM,
            ModelPartBuilder.create()
                .uv(40, 16).cuboid(-3, -2, -2, 4, 12, 4, new Dilation(0f)),
            ModelTransform.pivot(-5, 2, 0));

        // LEFT_ARM — braço esquerdo
        root.addChild(EntityModelPartNames.LEFT_ARM,
            ModelPartBuilder.create()
                .uv(32, 48).cuboid(-1, -2, -2, 4, 12, 4, new Dilation(0f)),
            ModelTransform.pivot(5, 2, 0));

        // RIGHT_LEG — perna direita
        root.addChild(EntityModelPartNames.RIGHT_LEG,
            ModelPartBuilder.create()
                .uv(0, 16).cuboid(-2, 0, -2, 4, 12, 4, new Dilation(0f)),
            ModelTransform.pivot(-1.9f, 12, 0));

        // LEFT_LEG — perna esquerda
        root.addChild(EntityModelPartNames.LEFT_LEG,
            ModelPartBuilder.create()
                .uv(16, 48).cuboid(-2, 0, -2, 4, 12, 4, new Dilation(0f)),
            ModelTransform.pivot(1.9f, 12, 0));

        return TexturedModelData.of(modelData, TEX_W, TEX_H);
    }

    /**
     * Renderiza apenas a cabeça com melhor controle para texturas de customização
     */
    public void renderHeadOnly(MatrixStack matrices, VertexConsumer vertices, int light, int overlay,
                              float red, float green, float blue, float alpha) {
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }

    /**
     * Renderiza o corpo completo com texturas de raça
     */
    public void renderBodyOnly(MatrixStack matrices, VertexConsumer vertices, int light, int overlay,
                              float red, float green, float blue, float alpha) {
        this.body.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.rightArm.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.leftArm.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.rightLeg.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.leftLeg.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}
