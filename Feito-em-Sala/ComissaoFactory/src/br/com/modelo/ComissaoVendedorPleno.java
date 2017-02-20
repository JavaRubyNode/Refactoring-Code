package br.com.modelo;

import br.com.generic.ICriadorDeComissao;

public class ComissaoVendedorPleno implements ICriadorDeComissao {

	@Override
	public double calcularComissao(double salario) {
		// TODO Auto-generated method stub
		return (salario*1.5);
	}

}
