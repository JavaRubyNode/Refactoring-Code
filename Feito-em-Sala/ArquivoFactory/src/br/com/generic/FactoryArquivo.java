package br.com.generic;

import br.com.modelo.CriadorTXT;
import br.com.modelo.CriadorXML;

public class FactoryArquivo {

	public static ICriadorArquivo criador(EnumTipoArquivo tipo){
		if (tipo.equals(EnumTipoArquivo.TXT)) {
			return new CriadorTXT();
		} 
		else {
			return new CriadorXML();
		}
	}
	
	
	
	
}
