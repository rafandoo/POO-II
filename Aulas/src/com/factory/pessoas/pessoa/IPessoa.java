package com.factory.pessoas.pessoa;

public interface IPessoa {

    public default String info() {
        return "generico";
    }
}
