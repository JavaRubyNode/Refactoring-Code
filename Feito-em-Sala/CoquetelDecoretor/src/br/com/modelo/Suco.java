package br.com.modelo;

import br.com.generic.Coquetel;
import br.com.generic.CoquetelDecoretor;

public class Suco extends CoquetelDecoretor{

	public Suco(String nome, double preco, Coquetel coquetel) {
		super(nome, preco, coquetel);
		
	}
	
//	public void imprimir(){
//		System.out.println("Suco");
//		super.imprimir();
//		System.out.println(super.getNome()+" - "+super.getPreco());
//	}

}
