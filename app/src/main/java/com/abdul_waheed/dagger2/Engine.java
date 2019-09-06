package com.abdul_waheed.dagger2;

import javax.inject.Inject;

public class Engine {

    private SparkPlugs sparkPlugs;
    private Cylinder cylinder;
    private Block block;

    @Inject
    public Engine(SparkPlugs sparkPlugs, Cylinder cylinder, Block block) {
        this.sparkPlugs = sparkPlugs;
        this.cylinder = cylinder;
        this.block = block;
    }
}
