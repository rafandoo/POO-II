package com.factory.pessoas.pessoa;

public class Homem extends Pessoa implements IPessoa {

    public Homem(String nome, String sexo) {
        super(nome, sexo);
    }

    @Override
    public String info() {
        return "homem";
    }
}
