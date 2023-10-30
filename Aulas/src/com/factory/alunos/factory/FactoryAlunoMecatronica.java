package com.factory.alunos.factory;

import com.factory.alunos.aluno.Aluno;
import com.factory.alunos.aluno.AlunoMecatronica;

public class FactoryAlunoMecatronica implements FactoryAluno {

    @Override
    public Aluno criarAluno() {
        return new AlunoMecatronica();
    }
}
