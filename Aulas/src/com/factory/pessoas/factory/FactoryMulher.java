package com.factory.pessoas.factory;

import com.factory.pessoas.pessoa.Mulher;
import com.factory.pessoas.pessoa.Pessoa;

public class FactoryMulher implements IFactoryPessoa {

    @Override
    public Pessoa criarPessoa(String nome, String sexo) {
        return new Mulher(nome, sexo);
    }
}
