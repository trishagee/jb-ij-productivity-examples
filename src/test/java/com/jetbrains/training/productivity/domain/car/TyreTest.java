package com.jetbrains.training.productivity.domain.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TyreTest {
    @Test
    @DisplayName("Should create incorrect tyre for intentionally incorrect factory shouldCreateIncorrectTyreForIntentionallyIncorrectFactoryMethod")
    void shouldCreateIncorrectTyreForIntentionallyIncorrectFactoryShouldCreateIncorrectTyreForIntentionallyIncorrectFactoryMethod() {
        // when
        Tyre tyre = Tyre.createIncorrect();

        // then
        assertNotNull(tyre);
        assertEquals("BRAND", tyre.model());
        assertEquals("MODEL", tyre.brand());
    }

}