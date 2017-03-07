package br.com.modelo;

import br.com.generico.FiguraGeometrica;

public class Quadrado implements FiguraGeometrica {

	private double lado;
	
	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.pow(getLado(), 2);
	}

}
