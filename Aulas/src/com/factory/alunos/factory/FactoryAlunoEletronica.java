package com.factory.alunos.factory;

import com.factory.alunos.aluno.Aluno;
import com.factory.alunos.aluno.AlunoEletronica;

public class FactoryAlunoEletronica implements FactoryAluno {

    @Override
    public Aluno criarAluno() {
        return new AlunoEletronica();
    }
}
