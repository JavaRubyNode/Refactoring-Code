package br.com.main;

import br.com.generico.CriadorArquivo;
import br.com.generico.FactoryArquivo;
import br.com.generico.TipoDeArquivo;

public class MainFactory {

	public static void main(String[] args) {
		
CriadorArquivo criadorTXT = FactoryArquivo.criador(TipoDeArquivo.TXT);
criadorTXT.criar("arquivo-TXT");
criadorTXT.gravar("Reinaldo Jr");

CriadorArquivo criadorXML = FactoryArquivo.criador(TipoDeArquivo.XML);
criadorXML.criar("arquivo-XML");
criadorXML.gravar("Reinaldo Jr");

	}

}
