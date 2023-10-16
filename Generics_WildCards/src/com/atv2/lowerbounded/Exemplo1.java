package com.atv2.lowerbounded;

import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {
    public static void addNumeros(List<? super Integer> numeros) {
        for (int i = 1; i <= 5; i++) {
            numeros.add(i);
        }
    }

    public static void main(String[] args) {
        List<Number> numberList = new ArrayList<>();
        addNumeros(numberList);
        System.out.println("Lista de números: " + numberList);

        List<Object> objectList = new ArrayList<>();
        addNumeros(objectList);
        System.out.println("Lista de objetos: " + objectList);
    }
}
