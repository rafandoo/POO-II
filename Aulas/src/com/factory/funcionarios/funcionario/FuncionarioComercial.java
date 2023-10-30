package com.factory.funcionarios.funcionario;

public class FuncionarioComercial extends Funcionario implements IFuncionario {

    public FuncionarioComercial(String nome, String matricula) {
        super(nome, matricula);
    }
    @Override
    public String info() {
        return "Comercial";
    }
}
