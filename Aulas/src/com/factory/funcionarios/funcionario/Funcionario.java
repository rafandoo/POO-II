package com.factory.funcionarios.funcionario;

public class Funcionario implements IFuncionario {
    private String nome;
    private String matricula;

    public Funcionario(String nome, String matricula) {
        setNome(nome);
        setMatricula(matricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String info() {
        return "generico";
    }
}
