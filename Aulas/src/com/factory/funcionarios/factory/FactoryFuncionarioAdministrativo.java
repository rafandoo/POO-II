package com.factory.funcionarios.factory;

import com.factory.funcionarios.funcionario.Funcionario;
import com.factory.funcionarios.funcionario.FuncionarioAdministrativo;

public class FactoryFuncionarioAdministrativo implements FactoryFuncionario {
    @Override
    public Funcionario criarFuncionario(String nome, String matricula) {
        return new FuncionarioAdministrativo(nome, matricula);
    }
}
