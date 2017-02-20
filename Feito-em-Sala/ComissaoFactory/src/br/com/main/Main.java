package br.com.main;

import br.com.generic.EnumTipoComissao;
import br.com.generic.FactoryComissao;
import br.com.generic.ICriadorDeComissao;

public class Main {

	public static void main(String[] args) {
	
		ICriadorDeComissao criadorJR = FactoryComissao.criador(EnumTipoComissao.JR);
		System.out.println(criadorJR.calcularComissao(2000));
		
		ICriadorDeComissao criadorPL = FactoryComissao.criador(EnumTipoComissao.Pl);
		System.out.println(criadorPL.calcularComissao(4000));
	    
		ICriadorDeComissao criadorSR = FactoryComissao.criador(EnumTipoComissao.SR);
		System.out.println(criadorSR.calcularComissao(8000));
		

	}

}
