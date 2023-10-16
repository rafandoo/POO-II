package com.atv1.exercicio2;

public class Produto<T> {
	
	// CONSTRUTORES
	public Produto() {
		
	}
	
	public Produto(T id, String produto, double valor, String dataFabricacao, String dataVencimento) {
		setId(id);
		setProduto(produto);
		setValor(valor);
		setDataFabricacao(dataFabricacao);
		setDataVencimento(dataVencimento);	
	}
	
	// ATRIBUTOS
	private T id;
	private String produto;
	private double valor;
	private String dataFabricacao;
	private String dataVencimento;
	
	// GETTERS E SETTERS
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		if(produto.length() > 0) {
			this.produto = produto;
		}
	}
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if(valor > 0) {
			this.valor = valor;
		}
	}
	
	public String getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(String dataFabricacao) {
		if(dataFabricacao.length() > 0) {
			this.dataFabricacao = dataFabricacao;
		}
	}
	
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		if(dataVencimento.length() > 0) {
			this.dataVencimento = dataVencimento;
		}
	}

	@Override
	public String toString() {
		return "Produto{" +
				"id=" + id +
				", produto='" + produto + '\'' +
				", valor=" + valor +
				", dataFabricacao='" + dataFabricacao + '\'' +
				", dataVencimento='" + dataVencimento + '\'' +
				'}';
	}
}
