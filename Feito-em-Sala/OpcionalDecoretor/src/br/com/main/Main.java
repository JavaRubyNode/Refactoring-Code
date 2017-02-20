package br.com.main;

import br.com.generic.OpcionalDecoretor;
import br.com.modelo.ArCondicionado;
import br.com.modelo.ComboA;

public class Main {
	
	public static void main(String[] args) {
			OpcionalDecoretor decoretor = new ComboA("completo", 10, new ArCondicionado("top", 50));
			decoretor.imprimir();
	}

}
