package com.jetbrains.training.productivity.domain.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static com.jetbrains.training.productivity.domain.car.PressureUnit.BAR;
import static java.math.BigDecimal.ONE;
import static org.junit.jupiter.api.Assertions.*;

class TyreTest {
    @Test
    @DisplayName("Should create incorrect tyre for intentionally incorrect factory method")
    void shouldCreateIncorrectTyreForIntentionallyIncorrectFactoryMethod() {
        // when
        Tyre tyre = Tyre.createIncorrect();

        // then
        assertNotNull(tyre);
        assertEquals("BRAND", tyre.model());
        assertEquals("MODEL", tyre.brand());
    }

    @Test
    @DisplayName("Should create a non empty default tyre")
    void shouldCreateANonEmptyDefaultTyre() {
        // when
        Tyre tyre = Tyre.create();

        // then
        assertNotNull(tyre);
        assertAll(() -> assertEquals("BRAND", tyre.brand()),
                  () -> assertEquals("MODEL", tyre.model()),
                  () -> assertEquals(ONE, tyre.pressure()),
                  () -> assertEquals(BAR, tyre.pressureUnit()));
    }

}