package com.jetbrains.training.productivity.domain.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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
        assertEquals("BRAND", tyre.brand());
        assertEquals("MODEL", tyre.model());
    }

}