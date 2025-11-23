package com.jetbrains.training.productivity.rundebug;

import com.jetbrains.training.productivity.rundebug.car.Car;

import static java.lang.IO.println;

public class CarApplication     {
    static void main() {
        Car car = new Car("Ford", "Mondeo", Color.BLACK);
        println(car);
    }
}
