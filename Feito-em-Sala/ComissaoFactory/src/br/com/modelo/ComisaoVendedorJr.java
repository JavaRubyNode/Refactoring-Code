package br.com.modelo;

import br.com.generic.ICriadorDeComissao;

public class ComisaoVendedorJr implements ICriadorDeComissao {

	@Override
	public double calcularComissao(double salario) {
		
		return (salario*1.3);
	}

}
