package com.abdul_waheed.dagger2;


import androidx.appcompat.app.AppCompatActivity;

import dagger.Component;

/*
* Component is the most important thing of dagger. It is a backbone. This is where the classed like 'Activity' get object from they
* want to use. Component creates dependency graph. It knows our car needs. It has directed acyclic graph.
* */

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent { // we can call it Injector

    Car getCar();

    void inject(AppCompatActivity appCompatActivity);
}
