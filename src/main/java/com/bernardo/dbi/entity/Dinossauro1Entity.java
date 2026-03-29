package com.bernardo.dbi.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.World;

/**
 * Dino1 - Formato Bípede Ágil
 */
public class Dinossauro1Entity extends DinoEntity {

    public Dinossauro1Entity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createDinossauro1Attributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 150.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.35)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 30.0)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 32.0)
                .add(EntityAttributes.GENERIC_ARMOR, 5.0);
    }
}