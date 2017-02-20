package br.com.modelo;

import br.com.generic.IImpressora;

public class ImpressoraNFiscal implements IImpressora {

	private String texto;
		
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
		

	public ImpressoraNFiscal(String texto) {
		super();
		this.texto = texto;
	}
	@Override
	public void imprimir() {
		System.out.println("Impressora " + getTexto());

	}

}