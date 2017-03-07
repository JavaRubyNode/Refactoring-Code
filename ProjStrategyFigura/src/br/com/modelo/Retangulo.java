package br.com.modelo;

import br.com.generico.FiguraGeometrica;

public class Retangulo implements FiguraGeometrica {

	private double altura;
	private double base;
	
	public Retangulo(double altura, double base) {
		super();
		this.altura = altura;
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (getBase() * getAltura());
	}

}
