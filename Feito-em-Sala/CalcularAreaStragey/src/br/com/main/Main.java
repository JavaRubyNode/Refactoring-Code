package br.com.main;

import br.com.generico.IFiguraGeometrica;
import br.com.modelo.Figura;
import br.com.modelo.Quadrado;
import br.com.modelo.Triagulo;

public class Main {

	public static void main(String[] args) {
		
		IFiguraGeometrica quadrado = new Quadrado(2.0);
		IFiguraGeometrica triangulo = new Triagulo(2, 5);
		
		
		Figura figura = new Figura();
		
		figura.setCalcular(new Quadrado(2.0));
		
		System.out.println(" Area quadrado ="+ figura.calcularArea());

		figura.setCalcular(new Triagulo(2, 5));
		System.out.println(" Area Triangulo ="+ figura.calcularArea());
		
		
		figura.executar(quadrado,triangulo);

	}

}
