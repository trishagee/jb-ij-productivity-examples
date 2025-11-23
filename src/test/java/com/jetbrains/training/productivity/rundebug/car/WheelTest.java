package com.jetbrains.training.productivity.rundebug.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WheelTest {
    @Test
    @DisplayName("Should create placeholder wheel with default factory shouldCreatePlaceholderWheelWithDefaultFactoryMethod")
    void shouldCreatePlaceholderWheelWithDefaultFactoryShouldCreatePlaceholderWheelWithDefaultFactoryMethod() {
        // when
        Wheel wheel = Wheel.create();

        // then
        assertAll(() -> {
                    assertNotNull(wheel);
                    assertEquals(WheelMaterial.STEEL, wheel.getWheelMaterial());
                    assertEquals("GENERIC", wheel.getTyre().getBrand());
                    assertEquals("NONE", wheel.getTyre().getModel());
                }
        );
    }

}