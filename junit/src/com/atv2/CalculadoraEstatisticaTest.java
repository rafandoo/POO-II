package com.atv2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraEstatisticaTest {

    @Test
    void testMedia() {
        double[] data = {1, 2, 3, 4, 5};
        CalculadoraEstatistica calc = new CalculadoraEstatistica(data);
        assertEquals(3.0, calc.media(), 0.001);
    }

    @Test
    void testMediana() {
        double[] data = {1, 2, 3, 4, 5};
        CalculadoraEstatistica calc = new CalculadoraEstatistica(data);
        assertEquals(3.0, calc.mediana(), 0.001);
    }

    @Test
    void testVariancia() {
        double[] data = {1, 2, 3, 4, 5};
        CalculadoraEstatistica calc = new CalculadoraEstatistica(data);
        assertEquals(2.5, calc.variancia(), 0.001);
    }

    @Test
    void testDesvioPadrao() {
        double[] data = {1, 2, 3, 4, 5};
        CalculadoraEstatistica calc = new CalculadoraEstatistica(data);
        assertEquals(1.581, calc.desvioPadrao(), 0.001);
    }

    @Test
    void testModa() {
        double[] data = {1, 2, 2, 3, 3, 4, 5};
        CalculadoraEstatistica calc = new CalculadoraEstatistica(data);
        assertArrayEquals(new double[]{2.0, 3.0}, calc.moda(), 0.001);
    }

}