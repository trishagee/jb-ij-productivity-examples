package com.jetbrains.training.productivity.debug;

import com.jetbrains.training.productivity.domain.Color;
import com.jetbrains.training.productivity.domain.car.Car;
import com.jetbrains.training.productivity.domain.car.Tyre;
import com.jetbrains.training.productivity.domain.car.Wheel;

import static com.jetbrains.training.productivity.domain.car.WheelMaterial.ALLOY;
import static java.lang.IO.println;

public class DebugCar {
    static void main() {
        Car car = new Car("Test", "Car", Color.BLUE, createWheels());

        println(car);
    }

    //<editor-fold desc="Helper methods">
    private static Wheel[] createWheels() {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(ALLOY, Tyre.createIncorrect());
        }
        return wheels;
    }
    //</editor-fold>
}
