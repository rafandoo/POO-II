package com.factory.pessoas.pessoa;

public class Mulher extends Pessoa implements IPessoa {

    public Mulher(String nome, String sexo) {
        super(nome, sexo);
    }

    @Override
    public String info() {
        return "mulher";
    }
}
