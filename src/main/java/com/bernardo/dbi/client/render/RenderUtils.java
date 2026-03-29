package com.bernardo.dbi.client.render;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

/**
 * Utilitários para melhorar a renderização de texturas de customização
 */
public class RenderUtils {

    /**
     * Renderiza uma textura com melhor controle de transparência e blending
     */
    public static void renderCustomTexture(MatrixStack matrices, VertexConsumer vertexConsumer,
                                         int light, int overlay, float alpha, Runnable renderFunction) {
        matrices.push();
        renderFunction.run();
        matrices.pop();
    }

    /**
     * Cria um RenderLayer otimizado para texturas de customização
     */
    public static RenderLayer getCustomTextureLayer(Identifier texture) {
        return RenderLayer.getEntityTranslucent(texture);
    }

    /**
     * Ajusta a posição Z para layering correto das texturas faciais
     */
    public static float getFaceLayerOffset(String featureType) {
        return switch (featureType) {
            case "hair" -> 0.0f;
            case "nose" -> 0.02f;
            case "eyes" -> 0.01f;
            case "mouth" -> 0.025f;
            default -> 0.0f;
        };
    }

    /**
     * Ajusta a posição Y para melhor alinhamento facial
     */
    public static float getFaceVerticalOffset(String featureType) {
        return switch (featureType) {
            case "hair" -> -0.25f;
            case "nose" -> -0.0625f;
            case "eyes" -> -0.125f;
            case "mouth" -> 0.0f;
            default -> 0.0f;
        };
    }

    /**
     * Retorna o alpha ideal para cada tipo de feature
     */
    public static float getFeatureAlpha(String featureType) {
        return switch (featureType) {
            case "hair" -> 0.9f;
            case "nose" -> 0.9f;
            case "eyes" -> 0.95f;
            case "mouth" -> 0.85f;
            case "race_body" -> 0.95f;
            default -> 1.0f;
        };
    }
}