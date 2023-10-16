package com.atv1.exercicio3;

public class ProdutoX {
	
	// ATRIBUTOS
	private int codigo;
	private String descricao;
	private double valor;

	// CONSTRUTORES
	public ProdutoX() {
		
	}
	public ProdutoX(String descricao, double valor, int codigo) {
		setDescricao(descricao);
		setValor(valor);
		setCodigo(codigo);
	}
	
	// GETTERS E SETTERS
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "ProdutoX{" +
				"codigo=" + codigo +
				", descricao='" + descricao + '\'' +
				", valor=" + valor +
				'}';
	}
}
