package com.atv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CalculadoraEstatistica {
    private double[] valores;

    public CalculadoraEstatistica(double[] valores) {
        this.valores = valores;
    }

    public double media() {
        if (valores.length == 0) {
            throw new IllegalArgumentException("Sem dados para a média");
        }

        double sum = 0;
        for (double valor : valores) {
            sum += valor;
        }

        return sum / valores.length;
    }

    public double mediana() {
        if (valores.length == 0) {
            throw new IllegalArgumentException("Sem dados para a mediana");
        }

        Arrays.sort(valores);
        int meio = valores.length / 2;

        if (valores.length % 2 == 0) {
            double meio1 = valores[meio - 1];
            double meio2 = valores[meio];
            return (meio1 + meio2) / 2;
        } else {
            return valores[meio];
        }
    }

    public double variancia() {
        if (valores.length < 2) {
            throw new IllegalArgumentException("Sem dados para a variância");
        }

        double media = media();
        double dquadrados = 0;

        for (double valor : valores) {
            double diferenca = valor - media;
            dquadrados += diferenca * diferenca;
        }

        return dquadrados / (valores.length - 1);
    }

    public double desvioPadrao() {
        return Math.sqrt(variancia());
    }

    public double[] moda() {
        if (valores.length == 0) {
            throw new IllegalArgumentException("Sem dados para a moda");
        }

        Map<Double, Integer> vCount = new HashMap<>();
        for (double valor : valores) {
            vCount.put(valor, vCount.getOrDefault(valor, 0) + 1);
        }

        int maxN = vCount.values().stream().mapToInt(count -> count).filter(count -> count >= 0).max().orElse(0);

        if (maxN <= 1) {
            return null;
        }

        return vCount.entrySet().stream()
                .filter(entry -> entry.getValue() == maxN)
                .map(Map.Entry::getKey)
                .mapToDouble(Double::doubleValue)
                .toArray();
    }
}
