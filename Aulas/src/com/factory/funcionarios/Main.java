package com.factory.funcionarios;

import com.factory.funcionarios.factory.FactoryFuncionario;
import com.factory.funcionarios.factory.FactoryFuncionarioAdministrativo;
import com.factory.funcionarios.funcionario.Funcionario;

public class Main {
    public static void main(String[] args) {
        FactoryFuncionario factory = new FactoryFuncionarioAdministrativo();

        Funcionario funcionario = factory.criarFuncionario("Rafael", "123");
        System.out.println(funcionario.info());
    }
}
