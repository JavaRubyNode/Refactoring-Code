package br.com.generico;

import br.com.modelo.CriadorTXT;
import br.com.modelo.CriadorXML;

public class FactoryArquivo {

	public static CriadorArquivo criador(TipoDeArquivo tipoArquivo) {
		if (tipoArquivo.equals(TipoDeArquivo.TXT)) {
			return new CriadorTXT();
		} 
		else {
			return new CriadorXML();
		}
	}
	
}
