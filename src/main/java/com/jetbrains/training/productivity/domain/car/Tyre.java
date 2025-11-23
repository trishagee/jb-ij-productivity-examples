package com.jetbrains.training.productivity.domain.car;

import java.math.BigDecimal;

public class Tyre {
    private final String brand;
    private final String model;
    private final BigDecimal pressure;
    private final PressureUnit pressureUnit;

    public Tyre(String brand, String model, BigDecimal pressure, PressureUnit pressureUnit) {
        this.brand = brand;
        this.model = model;
        this.pressure = pressure;
        this.pressureUnit = pressureUnit;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPressure() {
        return pressure;
    }

    public PressureUnit getPressureUnit() {
        return pressureUnit;
    }
}
