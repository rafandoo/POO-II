package com.factory.pessoas.factory;

import com.factory.pessoas.pessoa.Pessoa;

public class FactoryPessoaNew implements IFactoryPessoa {
    @Override
    public Pessoa criarPessoa(String nome, String sexo) {
        if ("F".equalsIgnoreCase(sexo)) {
            FactoryMulher factory = new FactoryMulher();
            return factory.criarPessoa(nome, sexo);
        } else if ("M".equalsIgnoreCase(sexo)) {
            FactoryHomem factory = new FactoryHomem();
            return factory.criarPessoa(nome, sexo);
        }
        return new Pessoa(nome, sexo);
    }
}
