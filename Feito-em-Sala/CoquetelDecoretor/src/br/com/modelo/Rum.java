package br.com.modelo;

import br.com.generic.Coquetel;

public class Rum extends Coquetel{

	public Rum(String nome, double preco) {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}
	
	
	public void imprimir(){
		System.out.println("Vodka");
		super.imprimir();
	}
	

}
