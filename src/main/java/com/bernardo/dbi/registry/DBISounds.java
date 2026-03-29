package com.bernardo.dbi.registry;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import com.bernardo.dbi.Dbi;

public class DBISounds {

    public static final SoundEvent DINO_STEP = registerSoundEvent("passos");

    private static SoundEvent registerSoundEvent(String id) {
        Identifier identifier = new Identifier(Dbi.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, 
            SoundEvent.of(identifier));
    }

    public static void initialize() {
        // Apenas para forçar o carregamento da classe
    }
}