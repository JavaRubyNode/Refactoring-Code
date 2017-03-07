package br.com.main;

import br.com.modelo.DevEstagio;
import br.com.modelo.DevJr;
import br.com.modelo.DevNew;
import br.com.modelo.DevPleno;

public class MainSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DevNew devPleno = new DevNew("Maria Aparecida", 
									"222.1111.333-00",
									4000, new DevPleno());
		System.out.println("Salario Dev Pleno "+devPleno.calcularSalario());
		
		DevNew devJr = new DevNew("Antonio Soares", 
				"222.1111.333-00",
				2000, new DevJr());
		System.out.println("Salario Dev Jr "+devJr.calcularSalario()); 
		
		DevNew devEstagio = new DevNew("Estagiario", 
				"222.1111.333-00",
				1000, new DevEstagio());
		System.out.println("Salario DevEstagio "+devEstagio.calcularSalario()); 		

	}

}
