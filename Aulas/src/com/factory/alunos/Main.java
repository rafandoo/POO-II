package com.factory.alunos;

import com.factory.alunos.aluno.Aluno;
import com.factory.alunos.factory.FactoryAluno;
import com.factory.alunos.factory.FactoryAlunoInformatica;

public class Main {
    public static void main(String[] args) {
        FactoryAluno factory = new FactoryAlunoInformatica();
        Aluno aluno = factory.criarAluno();
        System.out.println(aluno.mostrarInfo());
    }
}