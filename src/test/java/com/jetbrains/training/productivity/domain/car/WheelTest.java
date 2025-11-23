package com.jetbrains.training.productivity.domain.car;

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
        assertNotNull(wheel);
        assertAll(() -> assertEquals(WheelMaterial.STEEL, wheel.getWheelMaterial()),
                  () -> assertEquals("GENERIC", wheel.getTyre().brand()),
                  () -> assertEquals("NONE", wheel.getTyre().model()));
    }

}