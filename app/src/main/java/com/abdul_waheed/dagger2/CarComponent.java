package com.abdul_waheed.dagger2;


import androidx.appcompat.app.AppCompatActivity;

import dagger.Component;

@Component
public interface CarComponent {

    Car getCar();

    void inject(AppCompatActivity appCompatActivity);
}
