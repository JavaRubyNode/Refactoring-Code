package br.com.modelo;

import br.com.generico.IFiguraGeometrica;

public class Triagulo implements IFiguraGeometrica {

	private double altura;
	private double base;
		
	public double getAltura() {return altura;}

	public void setAltura(double altura) {this.altura = altura;}

	public double getBase() {return base;}

	public void setBase(double base) {this.base = base;}
		
	public Triagulo(double altura, double base) {super();this.altura = altura;this.base = base;}


	@Override
	public double calcularArea() {return ((base*altura)/2);}

}
