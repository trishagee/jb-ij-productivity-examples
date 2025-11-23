package com.jetbrains.training.productivity.rundebug;

import com.jetbrains.training.productivity.rundebug.car.Car;

public class CarApplication     {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Mondeo", Color.BLACK);
        System.out.println(car);
    }
}
