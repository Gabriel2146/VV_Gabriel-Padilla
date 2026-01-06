package com.example.demo.suma;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumaTest {

    Suma suma = new Suma();

    @Test
    public void testSumaPositivos() {
        int resultado = suma.suma(3, 5);
        org.junit.jupiter.api.Assertions.assertEquals(8, resultado);
    }
    @Test
    public void testSumaNegativos() {
        int resultado = suma.suma(-3, -5);
        org.junit.jupiter.api.Assertions.assertEquals(-8, resultado);
    }
    @Test
    public void testSumaCero() {
        int resultado = suma.suma(0, 5);
        org.junit.jupiter.api.Assertions.assertEquals(5, resultado);
    }

}