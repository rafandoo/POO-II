package com.factory.pessoas.factory;

import com.factory.pessoas.pessoa.Pessoa;

public interface IFactoryPessoa {
    public Pessoa criarPessoa(String nome, String sexo);
}
