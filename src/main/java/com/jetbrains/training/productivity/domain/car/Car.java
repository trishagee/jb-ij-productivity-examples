package com.jetbrains.training.productivity.domain.car;

import com.jetbrains.training.productivity.domain.Color;

public class Car {
    private final Color color;
    private final String make;
    private final String model;
    private final Wheel[] wheels = new Wheel[4];

    public Car(String make, String model, Color color) {
        this.color = color;
        this.make = make;
        this.model = model;
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = Wheel.create();
        }
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
}
