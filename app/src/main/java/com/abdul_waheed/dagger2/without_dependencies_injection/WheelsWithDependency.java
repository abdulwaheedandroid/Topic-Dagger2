package com.abdul_waheed.dagger2.without_dependencies_injection;

public class WheelsWithDependency {
    Tires tires;
    Rims rims;

    public WheelsWithDependency(Tires tires, Rims rims) {
        this.tires = tires;
        this.rims = rims;
    }
}
