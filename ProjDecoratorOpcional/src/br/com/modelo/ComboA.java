package br.com.modelo;

import br.com.generico.Opcional;
import br.com.generico.OpcionalDecorator;

public class ComboA extends OpcionalDecorator {

	public ComboA(String descricao, double preco, Opcional opcional) {
		super(descricao, preco, opcional);
	}

}
