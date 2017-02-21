package br.com.main;

import br.com.generic.DecoretorSanduiche;
import br.com.modelo.Catupiry;
import br.com.modelo.CoracaoDeFrango;

public class Main {

	public static void main(String[] args) {
		DecoretorSanduiche sanduiche = new Catupiry("Catupiry Grande", 5, new CoracaoDeFrango("X-Coracao", 15));
		sanduiche.imprimir();

	}

}
