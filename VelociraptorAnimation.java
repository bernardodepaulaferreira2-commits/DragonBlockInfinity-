package com.bernardo.dbi.client.animation;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class VelociraptorAnimation {

    public static final AnimationDefinition WALK = AnimationDefinition.Builder
            .withLength(1.0F)
            .looping()

            // body – rotate
            .addAnimation("body", new AnimationChannel(
                    AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F,
                            KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F,
                            KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.75F,
                            KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F),
                            AnimationChannel.Interpolations.LINEAR)
            ))

            // body – translate
            .addAnimation("body", new AnimationChannel(
                    AnimationChannel.Targets.POSITION,
                    new Keyframe(0.0F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, -2.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.75F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, -4.0F),
                            AnimationChannel.Interpolations.LINEAR)
            ))

            // head – rotate
            .addAnimation("head", new AnimationChannel(
                    AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F,
                            KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F,
                            KeyframeAnimations.degreeVec(0.0F, 0.0F, 5.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.75F,
                            KeyframeAnimations.degreeVec(0.0F, 0.0F, -5.0F),
                            AnimationChannel.Interpolations.LINEAR)
            ))

            // head – translate
            .addAnimation("head", new AnimationChannel(
                    AnimationChannel.Targets.POSITION,
                    new Keyframe(0.0F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, -2.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.75F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, -4.0F),
                            AnimationChannel.Interpolations.LINEAR)
            ))

            // rightLeg – rotate
            .addAnimation("rightLeg", new AnimationChannel(
                    AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F,
                            KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F,
                            KeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.5F,
                            KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR)
            ))

            // rightLeg – translate
            .addAnimation("rightLeg", new AnimationChannel(
                    AnimationChannel.Targets.POSITION,
                    new Keyframe(0.0F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.25F,
                            KeyframeAnimations.posVec(0.0F, 1.0F, -2.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.5F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, -7.0F),
                            AnimationChannel.Interpolations.LINEAR)
            ))

            // leftLeg – rotate
            .addAnimation("leftLeg", new AnimationChannel(
                    AnimationChannel.Targets.ROTATION,
                    new Keyframe(0.0F,
                            KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F,
                            KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.5F,
                            KeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.75F,
                            KeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(1.0F,
                            KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR)
            ))

            // leftLeg – translate
            .addAnimation("leftLeg", new AnimationChannel(
                    AnimationChannel.Targets.POSITION,
                    new Keyframe(0.0F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.1667F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.5F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, 1.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(0.75F,
                            KeyframeAnimations.posVec(0.0F, 3.0F, -7.0F),
                            AnimationChannel.Interpolations.LINEAR),
                    new Keyframe(1.0F,
                            KeyframeAnimations.posVec(0.0F, 0.0F, -7.0F),
                            AnimationChannel.Interpolations.LINEAR)
            ))

            .build();
}
