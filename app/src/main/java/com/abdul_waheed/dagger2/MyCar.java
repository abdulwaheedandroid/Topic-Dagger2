package com.abdul_waheed.dagger2;

import javax.inject.Inject;

public class MyCar {

    private Wheel wheel;
    private MyEngine engine;

    @Inject
    public MyCar(MyEngine engine, Wheel wheel) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public void drive() {
    }
}
