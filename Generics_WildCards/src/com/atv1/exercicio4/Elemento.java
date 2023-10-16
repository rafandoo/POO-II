package com.atv1.exercicio4;

public class Elemento<V> {

	// CONSTRUTOR
	public Elemento(String chave, V valor) {
		setChave(chave);
		setValor(valor);
	}
	
	// ATRIBUTOS
	private String chave;
	private V valor;
	
	// GETTERS E SETTERS
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	
	public V getValor() {
		return valor;
	}
	public void setValor(V valor) {
		this.valor = valor;
	}
	
}
