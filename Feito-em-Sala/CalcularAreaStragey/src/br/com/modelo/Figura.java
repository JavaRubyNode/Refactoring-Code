package br.com.modelo;

import java.util.List;
import java.util.Arrays;

import br.com.generico.IFiguraGeometrica;

public class Figura {

	
	private IFiguraGeometrica calcular;

    public double calcularArea(){return getCalcular().calcularArea();}
		
	public IFiguraGeometrica getCalcular() {return calcular;}

	public void setCalcular(IFiguraGeometrica calcular) {this.calcular = calcular;}
	
	
	public void executar (IFiguraGeometrica ...figura){
		double area=0.0;
		
		List<IFiguraGeometrica> lista = Arrays.asList(figura);
		
		for (IFiguraGeometrica iFigura : lista) {
			area=iFigura.calcularArea();
			System.out.println(" area "+ area);
		}
		
				
	}
}
