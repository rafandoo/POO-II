package com.atv1.exercicio1;

public class Main {

	public static void main(String[] args) {

		Elemento<String> e1 = new Elemento<>("Ola, mundo!");
		String str = e1.getElemento();
		
		Elemento<Integer> e2 = new Elemento<>(6);
		int i = e2.getElemento();
		
		Elemento<Pessoa> e3 = new Elemento<>(new Pessoa("Rafael", 18));
		Pessoa p = e3.getElemento();
		
		System.out.println(str);
		System.out.println(i);
		System.out.println(p);
		
	}

}
