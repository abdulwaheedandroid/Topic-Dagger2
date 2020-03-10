package com.abdul_waheed.dagger2.without_dependencies_injection;


import com.abdul_waheed.dagger2.Cylinder;

public class EngineWithDependency {

    Block block;
    SparkPlugs sparkPlugs;
    Cylinders cylinders;

    public EngineWithDependency(Block block, SparkPlugs sparkPlugs, Cylinders cylinders) {
        this.block = block;
        this.sparkPlugs = sparkPlugs;
        this.cylinders = cylinders;
    }
}
