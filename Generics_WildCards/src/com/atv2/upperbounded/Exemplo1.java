package com.atv2.upperbounded;

import java.util.ArrayList;
import java.util.List;

public class Exemplo1 {
    private static class Produto {
        private String nome;
        private double valor;

        public Produto(String nome, double valor) {
            this.nome = nome;
            this.valor = valor;
        }

        public String getNome() {
            return nome;
        }

        public double getValor() {
            return valor;
        }
    }
    public static double calcularValorTotal(List<? extends Produto> listaProdutos) {
        double total = 0;
        for (Produto produto : listaProdutos) {
            total += produto.getValor();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Produto A", 10.0));
        produtos.add(new Produto("Produto B", 20.0));

        double valorTotal = calcularValorTotal(produtos);
        System.out.println("Valor Total: " + valorTotal);
    }
}
