package br.com.main;

import br.com.modelo.FilaDeImpressora;
import br.com.modelo.ImpressoraECF;
import br.com.modelo.ImpressoraMatricial;
import br.com.modelo.ImpressoraNFiscal;
import br.com.modelo.ImpressoraZebra;

public class Main {

	public static void main(String[] args) {
		FilaDeImpressora fila = new FilaDeImpressora();
			
		fila.executarFila(new ImpressoraNFiscal(" NFiscal"),new ImpressoraECF(" ECF"),new ImpressoraMatricial(" Matricial"),new ImpressoraZebra(" Zebra"));

	}

}
