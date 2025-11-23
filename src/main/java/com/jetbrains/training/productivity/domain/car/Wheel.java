package com.jetbrains.training.productivity.domain.car;

import java.math.BigDecimal;

import static com.jetbrains.training.productivity.domain.car.PressureUnit.PSI;

public record Wheel(WheelMaterial wheelMaterial, Tyre tyre) {

    static Wheel create() {
        return new Wheel(WheelMaterial.STEEL, new Tyre("GENERIC", "NONE", new BigDecimal(20), PSI));
    }
}
