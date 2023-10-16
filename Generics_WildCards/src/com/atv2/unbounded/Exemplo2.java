package com.atv2.unbounded;

import java.util.Arrays;
import java.util.List;

public class Exemplo2 {
    public static double soma(List<?> lista) {
        double soma = 0;
        for (Object elemento : lista) {
            if (elemento instanceof Number) {
                soma += ((Number) elemento).doubleValue();
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        List<Integer> nint = Arrays.asList(1, 2, 3);
        List<Double> ndouble = Arrays.asList(1.1, 2.2, 3.3);

        double sint = soma(nint);
        double sdouble = soma(ndouble);

        System.out.println("Soma de inteiros: " + sint);
        System.out.println("Soma de decimais: " + sdouble);
    }
}
