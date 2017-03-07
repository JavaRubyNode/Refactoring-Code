package br.com.main;

import br.com.generico.CoquetelDecorator;
import br.com.modelo.Rum;
import br.com.modelo.Suco;

public class MainCoquetel {
	public static void main(String[] args) {
		CoquetelDecorator suco = new Suco("Suco de Abacaxi", 10, 
										 new Rum("Bakardi", 40));
		suco.imprimirComposicao();
	}
}
