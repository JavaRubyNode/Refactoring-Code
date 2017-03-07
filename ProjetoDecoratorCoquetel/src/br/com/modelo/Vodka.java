package br.com.modelo;

import br.com.generico.Coquetel;

public class Vodka extends Coquetel {

	public Vodka(String nome, double preco) {
		super(nome, preco);
	}
	
	public void imprimir() {
		System.out.println("VODKA");
		super.imprimir();
	}	
}
