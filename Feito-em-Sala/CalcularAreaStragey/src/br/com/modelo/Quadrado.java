package br.com.modelo;

import br.com.generico.IFiguraGeometrica;

public class Quadrado implements IFiguraGeometrica {

	private double lado;
	
	
	public double getLado() {return lado;}

	public void setLado(double lado) {this.lado = lado;}
		

	public Quadrado(double lado) {super();this.lado = lado;}

	@Override
	public double calcularArea() {
		
		return (lado*lado);
	}

}
