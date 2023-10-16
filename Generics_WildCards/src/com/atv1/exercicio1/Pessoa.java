package com.atv1.exercicio1;

public class Pessoa {

	// CONSTRUTORES
	public Pessoa() {

	}
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	// ATRIBUTOS
	private String nome;
	private int idade;
	
	// GETTER E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() > 0) {
			this.nome = nome;
		}
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		if(idade > 0) {
			this.idade = idade;
		}
	}

	// SAIDA
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome: ");
		builder.append(nome);
		builder.append(", idade: ");
		builder.append(idade);
		builder.append("]");
		return builder.toString();
	}

}
