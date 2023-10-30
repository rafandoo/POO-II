package com.factory.pessoas;

import com.factory.pessoas.factory.FactoryPessoa;
import com.factory.pessoas.pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        FactoryPessoa factory = new FactoryPessoa();
        Pessoa p1 = factory.criarPessoa("Rafa", "M");
        Pessoa p2 = factory.criarPessoa("Maria", "F");
        Pessoa p3 = factory.criarPessoa("Elu", " ");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(p3.info());
    }
}
