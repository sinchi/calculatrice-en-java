package com.autoscore.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires pour la classe Calculatrice.
 */
public class CalculatriceTest {

    private final Calculatrice calc = new Calculatrice();

    @Test
    public void testAddition() {
        assertEquals(5.0, calc.addition(2.0, 3.0), 0.001);
        assertEquals(0.0, calc.addition(-2.0, 2.0), 0.001);
        assertEquals(-5.0, calc.addition(-2.0, -3.0), 0.001);
    }

    @Test
    public void testSoustraction() {
        assertEquals(1.0, calc.soustraction(3.0, 2.0), 0.001);
        assertEquals(-1.0, calc.soustraction(2.0, 3.0), 0.001);
        assertEquals(0.0, calc.soustraction(5.0, 5.0), 0.001);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calc.multiplication(2.0, 3.0), 0.001);
        assertEquals(-6.0, calc.multiplication(-2.0, 3.0), 0.001);
        assertEquals(0.0, calc.multiplication(0.0, 5.0), 0.001);
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calc.division(6.0, 3.0), 0.001);
        assertEquals(-2.0, calc.division(-6.0, 3.0), 0.001);
        assertEquals(0.5, calc.division(1.0, 2.0), 0.001);
    }

    @Test
    public void testDivisionParZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.division(5.0, 0.0);
        });
        assertTrue(exception.getMessage().contains("Division par zéro"));
    }
}