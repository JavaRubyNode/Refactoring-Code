package br.com.main;

import br.com.generic.EnumTipoArquivo;
import br.com.generic.FactoryArquivo;
import br.com.generic.ICriadorArquivo;

public class Main {

	public static void main(String[] args) {
		ICriadorArquivo criadorTXT = FactoryArquivo.criador(EnumTipoArquivo.TXT);
		criadorTXT.criar("arquivo-TXT");
		criadorTXT.gravar("Reinaldo Jr");

		ICriadorArquivo criadorXML = FactoryArquivo.criador(EnumTipoArquivo.XML);
		criadorXML.criar("arquivo-XML");
		criadorXML.gravar("Reinaldo Jr");


	}

}
