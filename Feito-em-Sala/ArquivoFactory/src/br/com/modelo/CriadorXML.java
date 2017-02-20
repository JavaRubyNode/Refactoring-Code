package br.com.modelo;

import br.com.generic.ICriadorArquivo;

public class CriadorXML implements ICriadorArquivo {

	@Override
	public void criar(String nome) {
		System.out.println(" criador XML " +nome);

	}

	@Override
	public void gravar(String nome) {
		System.out.println(" criador XML " +nome);

	}

}
