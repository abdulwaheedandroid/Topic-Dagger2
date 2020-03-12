package com.abdul_waheed.dagger2;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";
    private Wheel wheel;
    private Engine engine;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.wheel = wheel;
        this.engine = engine;
    }

    public void drive() {
    }
}
