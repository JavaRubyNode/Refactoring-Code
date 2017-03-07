package br.com.modelo;

import br.com.generico.Coquetel;

public class Rum extends Coquetel {

	public Rum(String nome, double preco) {
		super(nome, preco);
	}
	
	public void imprimir() {
		System.out.println("RUM");
		super.imprimir();
	}	

}
