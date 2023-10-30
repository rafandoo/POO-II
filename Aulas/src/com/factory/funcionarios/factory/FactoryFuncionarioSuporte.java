package com.factory.funcionarios.factory;

import com.factory.funcionarios.funcionario.Funcionario;
import com.factory.funcionarios.funcionario.FuncionarioSuporte;

public class FactoryFuncionarioSuporte implements FactoryFuncionario {
    @Override
    public Funcionario criarFuncionario(String nome, String matricula) {
        return new FuncionarioSuporte(nome, matricula);
    }
}
