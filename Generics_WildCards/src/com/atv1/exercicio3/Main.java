package com.atv1.exercicio3;

public class Main {

	public static void main(String[] args) {
		ProdutoX p1 = new ProdutoX("Produto 1", 10.0, 1);
		ProdutoX p2 = new ProdutoX("Produto 2", 20.0, 2);

		Pedido pedido = new Pedido();

		pedido.adicionar(p1);
		pedido.adicionar(p2);

		pedido.mostrar();

	}

}
