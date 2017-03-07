package br.com.main;

import br.com.modelo.Figura;
import br.com.modelo.Quadrado;
import br.com.modelo.Retangulo;

public class MainFigura {

	public static void main(String[] args) {
		Figura quadrado = new Figura(new Quadrado(10));
		System.out.println("Quadrado " + quadrado.calcularArea());
		
		Figura retangulo = new Figura(new Retangulo(20, 20));
		System.out.println("Retangulo " + retangulo.calcularArea());
		
	}
	
}
