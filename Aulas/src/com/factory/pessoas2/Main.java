package com.factory.pessoas2;

public class Main {
    private static class Pessoa {
        private int cod;

        public Pessoa(int cod) {
            this.cod = cod;
        }

        public int getCod() {
            return cod;
        }

        public double salario(double salario, double comissao) {
            return salario + comissao;
        }
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa(25);
        p.salario(30, 40);
    }
}
