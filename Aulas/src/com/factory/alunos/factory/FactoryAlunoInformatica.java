package com.factory.alunos.factory;

import com.factory.alunos.aluno.Aluno;
import com.factory.alunos.aluno.AlunoInformatica;

public class FactoryAlunoInformatica implements FactoryAluno {

    @Override
    public Aluno criarAluno() {
        return new AlunoInformatica();
    }
}
