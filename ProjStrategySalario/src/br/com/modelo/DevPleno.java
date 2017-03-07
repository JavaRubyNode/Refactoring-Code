package br.com.modelo;

import br.com.generico.SalarioDev;

public class DevPleno implements SalarioDev {

	@Override
	public double calcularSalario(double salario) {
		// TODO Auto-generated method stub
		return (salario * 1.50);
	}

}
