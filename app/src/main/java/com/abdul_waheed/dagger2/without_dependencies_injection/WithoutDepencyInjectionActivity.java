package com.abdul_waheed.dagger2.without_dependencies_injection;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class WithoutDepencyInjectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        * This is manual dependency injection, it really pollutes our calling side. This is downside here.
        * Whenever we change a constructor or how we have to config these classes we have to update changes
        * everywhere which can be a very tedious process. And this is where dependency injection frameworks
        * like dagger comes in. The main responsibility of framework is to get rid of this boiler plate code.
        * We teach dagger how to construct these objects and this creates them at right time and in right order.
        * */

        Block block = new Block();
        Cylinders cylinders = new Cylinders();
        SparkPlugs sparkPlugs = new SparkPlugs();

        Tires tires = new Tires();
        Rims rims = new Rims();

        EngineWithDependency engineWithDependency = new EngineWithDependency(block, sparkPlugs, cylinders);
        WheelsWithDependency wheelsWithDependency = new WheelsWithDependency(tires, rims);

        Car carWithDepenciesWithChild = new Car(engineWithDependency, wheelsWithDependency);
        carWithDepenciesWithChild.drive();

        Engine engine = new Engine();
        Wheels wheels = new Wheels();

        Car car = new Car(engine, wheels);
        car.drive();

    }
}
