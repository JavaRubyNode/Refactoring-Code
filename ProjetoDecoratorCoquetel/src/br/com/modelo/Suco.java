package br.com.modelo;

import br.com.generico.Coquetel;
import br.com.generico.CoquetelDecorator;

public class Suco extends CoquetelDecorator {

	public Suco(String nome, double preco, Coquetel coquetel) {
		super(nome, preco, coquetel);
	}
}
