package com.abdul_waheed.dagger2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //private Car car;

    @Inject
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);

        car.drive();


        /*
         * Below is the injection via constructor way
         * */

        /*CarComponent carComponent = DaggerCarComponent.create();
        car = carComponent.getCar();*/

        /*
         * Below code is used before dagger
         * */
        /*Block block = new Block();
        Cylinder cylinder = new Cylinder();
        SparkPlugs sparkPlugs = new SparkPlugs();

        Tires tires = new Tires();
        Rims rims = new Rims();

        Engine engine = new Engine(sparkPlugs, cylinder, block);
        Wheel wheel = new Wheel(tires, rims);

        Car car = new Car(engine, wheel);
        car.drive();*/
    }
}
