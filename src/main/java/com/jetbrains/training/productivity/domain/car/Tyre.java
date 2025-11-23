package com.jetbrains.training.productivity.domain.car;

import java.math.BigDecimal;

public record Tyre(String brand, String model, BigDecimal pressure, PressureUnit pressureUnit) {

}
