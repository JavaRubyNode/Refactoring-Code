package br.com.modelo;

import br.com.generico.CriadorArquivo;

public class CriadorTXT implements CriadorArquivo {

	@Override
	public void criar(String nome) {
		System.out.println("Criar TXT " + nome);
	}

	@Override
	public void gravar(String nome) {
		System.out.println("Gravar TXT " + nome);
	}

}
