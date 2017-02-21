package br.com.modelo;

import br.com.generic.Sanduiche;

public class FileFrango extends Sanduiche{

	public FileFrango(String nome, double preco) {
		super(nome, preco);
	}
	
	public void imprimir(){
		mensagem("File de Frango");
		super.imprimir();
	}

}
