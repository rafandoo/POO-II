package com.atv1.exercicio3;

import java.util.ArrayList;

import java.util.List;

public class Pedido {
	
	// ATRIBUTOS
	private List<ProdutoX> produtos;

	// CONSTRUTOR
	public Pedido() {
		this.produtos = new ArrayList<>();
	}

	// METODOS
	public void adicionar(ProdutoX produto) {
		produtos.add(produto);
	}

	public void mostrar() {
		for (ProdutoX produto : produtos) {
			System.out.println(produto);
		}
	}
	
	
}
