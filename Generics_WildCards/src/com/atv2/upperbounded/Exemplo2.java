package com.atv2.upperbounded;

import java.util.Arrays;
import java.util.List;

public class Exemplo2 {
    public static void imprimirNumeros(List<? extends Number> numeros) {
        for (Number numero : numeros) {
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1, 2, 3);
        List<Double> numerosDecimais = Arrays.asList(1.1, 2.2, 3.3);

        imprimirNumeros(numerosInteiros);
        imprimirNumeros(numerosDecimais);
    }
}
