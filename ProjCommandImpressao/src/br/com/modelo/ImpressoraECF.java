package br.com.modelo;

import br.com.generico.Impressora;

public class ImpressoraECF implements Impressora {

	private String texto;
	
	public ImpressoraECF(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public void imprimir() {
		System.out.println("Impressora ECF " + getTexto());
	}
	
}
