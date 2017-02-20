package br.com.modelo;

import br.com.generic.Opcional;

public class ArCondicionado extends Opcional{

	public ArCondicionado(String descricao, double preco) {
		super(descricao, preco);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimir(){
		System.out.println(" Ar condocionado");
		super.imprimir();
	}

}
