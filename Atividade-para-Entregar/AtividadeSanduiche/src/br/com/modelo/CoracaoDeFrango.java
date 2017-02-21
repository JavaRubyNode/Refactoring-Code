package br.com.modelo;

import br.com.generic.Sanduiche;

public class CoracaoDeFrango extends Sanduiche{

	public CoracaoDeFrango(String nome, double preco) {
		super(nome, preco);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimir(){
		mensagem("OVO");
		super.imprimir();
	}

}
