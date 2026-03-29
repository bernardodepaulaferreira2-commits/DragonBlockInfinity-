package com.bernardo.dbi.registry;

import com.bernardo.dbi.Dbi;
import com.bernardo.dbi.entity.Dinossauro1Entity;
import com.bernardo.dbi.entity.VelociraptorEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DBIEntities {

    public static final EntityType<Dinossauro1Entity> DINOSSAURO1 = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Dbi.MOD_ID, "dinossauro1"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, Dinossauro1Entity::new)
                    .dimensions(EntityDimensions.fixed(1.2f, 2.0f))
                    .build()
    );

    public static final EntityType<VelociraptorEntity> VELOCIRAPTOR = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Dbi.MOD_ID, "velociraptor"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, VelociraptorEntity::new)
                    .dimensions(EntityDimensions.fixed(0.8f, 1.2f))
                    .build()
    );

    public static void initialize() {
        FabricDefaultAttributeRegistry.register(DINOSSAURO1, Dinossauro1Entity.createDinossauro1Attributes());
        FabricDefaultAttributeRegistry.register(VELOCIRAPTOR, VelociraptorEntity.createVelociraptorAttributes());
    }
}