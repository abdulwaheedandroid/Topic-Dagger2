package com.abdul_waheed.dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims2 provideRims2() {
        return new Rims2();
    }

    @Provides
    Tires2 provideTires() {
        return new Tires2();
    }

    @Provides
    Wheel2 provideWheels(Rims2 rims2, Tires2 tires2) {
        return new Wheel2(rims2, tires2);
    }
}
