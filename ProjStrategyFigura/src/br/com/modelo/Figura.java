package br.com.modelo;

import br.com.generico.FiguraGeometrica;

public class Figura {

	private FiguraGeometrica figura;

	public Figura(FiguraGeometrica figura) {
		super();
		this.figura = figura;
	}

	public FiguraGeometrica getFigura() {
		return figura;
	}

	public void setFigura(FiguraGeometrica figura) {
		this.figura = figura;
	}
	
	public double calcularArea() {
		// TODO Auto-generated method stub
		return getFigura().calcularArea();
	}	
	
}
