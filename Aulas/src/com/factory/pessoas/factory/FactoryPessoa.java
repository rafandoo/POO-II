package com.factory.pessoas.factory;

import com.factory.pessoas.pessoa.Homem;
import com.factory.pessoas.pessoa.Mulher;
import com.factory.pessoas.pessoa.Pessoa;

public class FactoryPessoa implements IFactoryPessoa {
    @Override
    public Pessoa criarPessoa(String nome, String sexo) {
        if ("F".equalsIgnoreCase(sexo)) {
            return new Mulher(nome, sexo);
        } else if ("M".equalsIgnoreCase(sexo)) {
            return new Homem(nome, sexo);
        }
        return new Pessoa(nome, sexo);
    }
}
