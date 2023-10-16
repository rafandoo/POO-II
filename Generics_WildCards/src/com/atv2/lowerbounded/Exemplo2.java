package com.atv2.lowerbounded;

import java.util.Stack;

public class Exemplo2 {
    public static void addNumerosPares(Stack<? super Integer> pilha) {
        for (int i = 2; i <= 10; i += 2) {
            pilha.push(i);
        }
    }

    public static void main(String[] args) {
        Stack<Number> pilhaNumeros = new Stack<>();
        addNumerosPares(pilhaNumeros);
        System.out.println("Pilha de números: " + pilhaNumeros);

        Stack<Object> pilhaObjetos = new Stack<>();
        addNumerosPares(pilhaObjetos);
        System.out.println("Pilha de objetos: " + pilhaObjetos);
    }
}
