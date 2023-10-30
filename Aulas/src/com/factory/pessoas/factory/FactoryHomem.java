package com.factory.pessoas.factory;

import com.factory.pessoas.pessoa.Homem;
import com.factory.pessoas.pessoa.Pessoa;

public class FactoryHomem implements IFactoryPessoa {
    @Override
    public Pessoa criarPessoa(String nome, String sexo) {
        return new Homem(nome, sexo);
    }
}
