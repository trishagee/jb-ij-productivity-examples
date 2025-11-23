package com.jetbrains.training.productivity.rundebug;

import com.jetbrains.training.productivity.rundebug.car.Wheel;
import com.jetbrains.training.productivity.rundebug.car.WheelMaterial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.jetbrains.training.productivity.rundebug.Color.ORANGE;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    @DisplayName("Should create a car with the defined values")
    void shouldCreateACarWithTheDefinedValues() {
        // when
        Car car = new Car("Ford", "Fiesta", ORANGE);

        // then
        assertAll(() -> {
                    assertNotNull(car);
                    assertEquals("Ford", car.getMake());
                    assertEquals("Fiesta", car.getModel());
                    assertEquals(ORANGE, car.getColor());
                }
        );
    }

    @Test
    @DisplayName("Should create placeholder wheels for a car with no defined wheels")
    void shouldCreatePlaceholderWheelsForACarWithNoDefinedWheels() {
        // when
        Car car = new Car("Ford", "Fiesta", ORANGE);

        // then
        assertAll(() -> {
                    Wheel[] wheels = car.getWheels();
                    assertNotNull(wheels);
                    assertEquals(4, wheels.length);

                    Wheel wheel = wheels[0];
                    assertNotNull(wheel);
                    assertEquals(WheelMaterial.STEEL, wheel.getWheelMaterial());
                    assertEquals("GENERIC", wheel.getTyre().getBrand());
                    assertEquals("NONE", wheel.getTyre().getModel());
                }

        );

    }
}