package com.atv1.exercicio1;

public class Elemento<E> {
	
	// ATRIBUTO
	private E elemento;
	
	// CONSTRUTOR
	public Elemento(E elemento) {
		this.elemento = elemento;
	}
	
	// GET
	public E getElemento() {
		return elemento;
	}

}
