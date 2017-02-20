package br.com.generic;

import br.com.modelo.ComisaoVendedorJr;
import br.com.modelo.ComissaoVendedorPleno;
import br.com.modelo.ComissaoVendedorSenior;

public class FactoryComissao {
	
	public static ICriadorDeComissao criador (EnumTipoComissao tipo){
	
		ICriadorDeComissao comisao=null;
		if(tipo.equals(EnumTipoComissao.JR)){
			return new ComisaoVendedorJr();
		}if (tipo.equals(EnumTipoComissao.Pl)) {
			return new ComissaoVendedorPleno();
		}if (tipo.equals(EnumTipoComissao.SR)) {
			return new ComissaoVendedorSenior();
		}
		return comisao;
	}

}
