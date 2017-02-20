package br.com.main;

import br.com.generic.CoquetelDecoretor;
import br.com.modelo.Rum;
import br.com.modelo.Suco;

public class Main {

	public static void main(String[] args) {
		CoquetelDecoretor suco = new Suco("Suco de Abacaxi", 10, 
				 new Rum("Bakardi", 40));
suco.imprimir();

	}

}
