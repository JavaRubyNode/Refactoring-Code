package br.com.modelo;

import br.com.generico.SalarioDev;

public class DevSenior implements SalarioDev {

	@Override
	public double calcularSalario(double salario) {return (salario*1.7);}

}
