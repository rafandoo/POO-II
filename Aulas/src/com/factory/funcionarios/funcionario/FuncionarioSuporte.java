package com.factory.funcionarios.funcionario;

public class FuncionarioSuporte extends Funcionario implements IFuncionario {

    public FuncionarioSuporte(String nome, String matricula) {
        super(nome, matricula);
    }
    @Override
    public String info() {
        return "Suporte";
    }
}
