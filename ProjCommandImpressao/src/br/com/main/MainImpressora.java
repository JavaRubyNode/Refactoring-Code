package br.com.main;

import br.com.modelo.FilaDeImpressao;
import br.com.modelo.ImpressoraECF;
import br.com.modelo.ImpressoraNFiscal;

public class MainImpressora {

	public static void main(String[] args) {
		FilaDeImpressao fila = new FilaDeImpressao();
		fila.adicionarImpressora(new ImpressoraECF("Reinaldo Jr"));
		fila.adicionarImpressora(new ImpressoraNFiscal("Reinaldo Jr"));
		fila.adicionarImpressora(new ImpressoraNFiscal("Pós-Graduação"));
		fila.adicionarImpressora(new ImpressoraECF("Pós-Graduação"));
		
		fila.executarFila();
		
	}
	
	
	
}
