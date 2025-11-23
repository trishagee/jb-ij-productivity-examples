package com.jetbrains.training.productivity.run;

import com.jetbrains.training.productivity.domain.Color;
import com.jetbrains.training.productivity.domain.car.Car;

import static java.lang.IO.println;

public class CarApplication     {
    static void main() {
        Car car = new Car("Ford", "Mondeo", Color.BLACK);
        println(car);
    }
}
