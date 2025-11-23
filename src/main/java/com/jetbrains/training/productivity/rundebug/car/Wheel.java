package com.jetbrains.training.productivity.rundebug.car;

import java.math.BigDecimal;

import static com.jetbrains.training.productivity.rundebug.car.PressureUnit.PSI;

public class Wheel {
    private final WheelMaterial wheelMaterial;
    private final Tyre tyre;

    public Wheel(WheelMaterial wheelMaterial, Tyre tyre) {
        this.wheelMaterial = wheelMaterial;
        this.tyre = tyre;
    }

    public WheelMaterial getWheelMaterial() {
        return wheelMaterial;
    }

    public Tyre getTyre() {
        return tyre;
    }

    static Wheel create() {
        return new Wheel(WheelMaterial.STEEL, new Tyre("GENERIC", "NONE", new BigDecimal(20), PSI));
    }
}
