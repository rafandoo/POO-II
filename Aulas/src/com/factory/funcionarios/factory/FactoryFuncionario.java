package com.factory.funcionarios.factory;

import com.factory.funcionarios.funcionario.Funcionario;

public interface FactoryFuncionario {
    public Funcionario criarFuncionario(String nome, String matricula);
}
