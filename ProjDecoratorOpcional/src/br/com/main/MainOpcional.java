package br.com.main;

import br.com.generico.OpcionalDecorator;
import br.com.modelo.VidroEletrico;

public class MainOpcional {

	public static void main(String[] args) {
OpcionalDecorator comboA = new OpcionalDecorator("Combo A", 100, new VidroEletrico("ABC", 1000));
comboA.imprimir();
		

	}

}
