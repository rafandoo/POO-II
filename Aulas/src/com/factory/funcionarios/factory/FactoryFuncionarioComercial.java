package com.factory.funcionarios.factory;

import com.factory.funcionarios.funcionario.Funcionario;
import com.factory.funcionarios.funcionario.FuncionarioComercial;

public class FactoryFuncionarioComercial implements FactoryFuncionario {

    @Override
    public Funcionario criarFuncionario(String nome, String matricula) {
        return new FuncionarioComercial(nome, matricula);
    }
}
