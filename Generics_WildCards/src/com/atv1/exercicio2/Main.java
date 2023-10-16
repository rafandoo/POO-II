package com.atv1.exercicio2;

public class Main {

	public static void main(String[] args) {

		Produto<Integer> p1 = new Produto<Integer>(613, "COOLER BOX 3700x", 36.4, "01/12/2019", "INDETERMINADO");
		
		Produto<String> p2 = new Produto<String>("LKS0565", "TINTA ACRILICA S/BR LINHA OURO 18L", 526.63, "05/06/2018", "25/12/2020");

		System.out.println(p1);
		System.out.println(p2);
	}

}
