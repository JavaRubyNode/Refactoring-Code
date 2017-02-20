package br.com.modelo;

import br.com.generic.IImpressora;

public class ImpressoraZebra implements IImpressora{

	private String texto;
		
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public void imprimir() {
		System.out.println("Impressora " + getTexto());

	}

	public ImpressoraZebra(String texto) {
		super();
		this.texto = texto;
	}

	
}
