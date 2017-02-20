package br.com.modelo;

import br.com.generic.Coquetel;

public class Vodka extends Coquetel{

		
	public void imprimir(){
		System.out.println("Vodka");
		super.imprimir();
	}
		
	public Vodka(String nome, double preco) {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}

	
	
	
}
