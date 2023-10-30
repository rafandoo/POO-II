package com.factory.funcionarios.funcionario;

public class FuncionarioAdministrativo extends Funcionario implements IFuncionario {

    public FuncionarioAdministrativo(String nome, String matricula) {
        super(nome, matricula);
    }
    @Override
    public String info() {
        return "Administrativo";
    }
}
