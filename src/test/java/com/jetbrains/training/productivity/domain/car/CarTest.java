package com.jetbrains.training.productivity.domain.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.jetbrains.training.productivity.domain.Color.ORANGE;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    @DisplayName("Should create a car with the defined values")
    void shouldCreateACarWithTheDefinedValues() {
        // when
        Car car = new Car("Ford", "Fiesta", ORANGE);

        // then
        assertNotNull(car);
        assertAll(() -> assertEquals("Ford", car.getMake()),
                  () -> assertEquals("Fiesta", car.getModel()),
                  () -> assertEquals(ORANGE, car.getColor()));
    }

    @Test
    @DisplayName("Should create placeholder wheels for a car with no defined wheels")
    void shouldCreatePlaceholderWheelsForACarWithNoDefinedWheels() {
        // when
        Car car = new Car("Ford", "Fiesta", ORANGE);

        // then
        Wheel[] wheels = car.getWheels();
        assertNotNull(wheels);
        assertEquals(4, wheels.length);
        for (Wheel wheel : wheels) {
            assertNotNull(wheel);
        }
    }
}