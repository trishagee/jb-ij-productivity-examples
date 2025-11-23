package com.jetbrains.training.productivity.domain.car;

import com.jetbrains.training.productivity.domain.Color;

import java.util.Arrays;

public class Car {
    private final String make;
    private final String model;
    private final Color color;
    private final Wheel[] wheels;

    public Car(String make, String model, Color color) {
        this.color = color;
        this.make = make;
        this.model = model;
        wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = Wheel.create();
        }
    }

    public Car(String make, String model, Color color, Wheel... wheels) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.wheels = wheels;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public Color getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", wheels=" + Arrays.toString(wheels) +
                '}';
    }
}
