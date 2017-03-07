package br.com.modelo;

import br.com.generico.SalarioDev;

public class DevSenior implements SalarioDev {

	@Override
	public double calcularSalario(double salario) {
		// TODO Auto-generated method stub
		return (salario * 1.70);
	}

}
