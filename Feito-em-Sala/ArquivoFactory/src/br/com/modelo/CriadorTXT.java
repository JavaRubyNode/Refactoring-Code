package br.com.modelo;

import br.com.generic.ICriadorArquivo;

public class CriadorTXT implements ICriadorArquivo {

	@Override
	public void criar(String nome) {
		System.out.println(" criador TXT " +nome);

	}

	@Override
	public void gravar(String nome) {
		System.out.println(" criador TXT " +nome);

	}

}
