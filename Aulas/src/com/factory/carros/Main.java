package com.carros;

import com.carros.carro.CarroProduct;
import com.carros.carro.ConcessionariaDirector;
import com.carros.carro.FiatBuilder;
import com.carros.carro.VolksBuider;

public class Main {
    public static void main(String[] args) {
        ConcessionariaDirector concessionaria = new ConcessionariaDirector(new FiatBuilder());
        concessionaria.construirCarro();
        CarroProduct carro = concessionaria.getCarro();
        System.out.println(carro);

        concessionaria = new ConcessionariaDirector(new VolksBuider());
        concessionaria.construirCarro();
        carro = concessionaria.getCarro();
        System.out.println(carro);
    }
}
