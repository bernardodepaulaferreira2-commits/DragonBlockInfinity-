package com.bernardo.dbi.client;

import net.fabricmc.api.ClientModInitializer;

public class ClientSetup implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Código de inicialização do cliente aqui
        System.out.println("Cliente do Dragon Block Infinity inicializado!");
    }
}