package com.abdul_waheed.dagger2;

import javax.inject.Inject;

public class Wheel {

    private Tires tires;
    private Rims rims;

    @Inject
    public Wheel(Tires tires, Rims rims) {
        this.tires = tires;
        this.rims = rims;
    }
}
