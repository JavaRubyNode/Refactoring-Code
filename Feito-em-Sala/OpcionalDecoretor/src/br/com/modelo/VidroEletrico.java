package br.com.modelo;

import br.com.generic.Opcional;

public class VidroEletrico extends Opcional{

	public VidroEletrico(String descricao, double preco) {
		super(descricao, preco);
		// TODO Auto-generated constructor stub
	}
	
	public void imprimir(){
		System.out.println("vidro eletrico");
		super.imprimir();
	}

}
