package com.atv1.exercicio4;

public class Main {

	public static void main(String[] args) {

		Elemento<Integer> e1 = new Elemento<Integer>("rafael", 6);
		Elemento<String> e2 = new Elemento<String>("rafael", "6");
		Elemento<String> e3 = new Elemento<String>("6", "rafael");
				
		ListElemento lista = new ListElemento();
		
		System.out.println(lista.inserir(e1));
		System.out.println(lista.inserir(e2));
		System.out.println(lista.inserir(e3));
		
		System.out.println("\nBuscando pela chave \"rafael\", valor: " 
		+ lista.buscaChave("rafael").getValor());
		
	}

}
