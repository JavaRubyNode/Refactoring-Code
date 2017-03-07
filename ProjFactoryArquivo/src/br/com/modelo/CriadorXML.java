package br.com.modelo;

import br.com.generico.CriadorArquivo;

public class CriadorXML implements CriadorArquivo {

	@Override
	public void criar(String nome) {
		System.out.println("Criar XML " + nome);
	}
	@Override
	public void gravar(String nome) {
		System.out.println("Gravar XML " + nome);
	}
}
