package com.abdul_waheed.dagger2;


import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {


    @Provides
    MyEngine provideEngine(PetrolEngine petrolEngine) {
        return petrolEngine;
    }
}
