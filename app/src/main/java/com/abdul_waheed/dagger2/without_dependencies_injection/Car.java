package com.abdul_waheed.dagger2.without_dependencies_injection;

public class Car {

    Engine engine;
    Wheels wheels;

    EngineWithDependency engineWithDependency;
    WheelsWithDependency wheelsWithDependency;

    Car() {
        /*
         * Car should not resposible for creating its part itself. Instead, it should be provided via outsi de or third party
         * And this is usually over constructor or via setter methods.
         * */
        engine = new Engine();
        wheels = new Wheels();
    }

    public Car(Engine engine, Wheels wheels) {
        /*
         * By this we decouple the construction process of a car
         * also construction of wheels and engine. By this we can easily pass different engines and wheels as required.
         * */
        this.engine = engine;
        this.wheels = wheels;
    }

    public Car(EngineWithDependency engineWithDependency, WheelsWithDependency wheelsWithDependency) {
        this.engineWithDependency = engineWithDependency;
        this.wheelsWithDependency = wheelsWithDependency;
    }

    public void drive() {

    }
}
