package com.jetbrains.training.productivity.domain.car;

import java.math.BigDecimal;

import static com.jetbrains.training.productivity.domain.car.PressureUnit.BAR;
import static java.math.BigDecimal.ONE;

public record Tyre(String brand, String model, BigDecimal pressure, PressureUnit pressureUnit) {

    public static Tyre createIncorrect() {
        return new Tyre("MODEL", "BRAND", ONE, BAR);
    }

    public static Tyre create() {
        return new Tyre("BRAND", "MODEL", ONE, BAR);
    }
}
