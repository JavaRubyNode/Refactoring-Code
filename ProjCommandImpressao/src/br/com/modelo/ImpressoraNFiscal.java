package br.com.modelo;

import br.com.generico.Impressora;

public class ImpressoraNFiscal implements Impressora {

	private String texto;
	
	public ImpressoraNFiscal(String texto) {
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
		System.out.println("Impressora NFiscal " + getTexto());
	}

}
