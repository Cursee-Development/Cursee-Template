package com.cursee.examplemod;

import net.fabricmc.api.ClientModInitializer;

public class ExampleModFabricClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        ExampleModClient.init();
    }
}
