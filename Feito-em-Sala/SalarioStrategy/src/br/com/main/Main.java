package br.com.main;

import br.com.modelo.DevNew;
import br.com.modelo.DevPleno;

public class Main {

	public static void main(String[] args) {
		DevNew devPleno = new DevNew("Maria Aparecida", "222.1111.333-00",4000, new DevPleno());
             System.out.println("Salario Dev Pleno "+devPleno.calcularSalario());

           DevNew devJr = new DevNew("Antonio Soares", "222.1111.333-00",2000, new DevPleno());
                 System.out.println("Salario Dev Jr "+devJr.calcularSalario()); 
	}

}
