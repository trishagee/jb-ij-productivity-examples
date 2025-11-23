package com.jetbrains.training.productivity.rundebug.car;

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
        return null;
    }
}
