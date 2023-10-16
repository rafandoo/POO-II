package com.atv2.unbounded;

import java.util.Arrays;
import java.util.List;

public class Exemplo1 {
    public static void imprimirLista(List<?> lista) {
        for (Object elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> numerosInteiros = Arrays.asList(1, 2, 3);
        List<String> strings = Arrays.asList("A", "B", "C");

        imprimirLista(numerosInteiros);
        imprimirLista(strings);
    }
}
