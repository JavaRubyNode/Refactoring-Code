package br.com.modelo;

import javax.swing.JOptionPane;

import br.com.generic.ICalculoJuros;
import br.com.generic.TipoJuros;

public class FactoryCalculo {

	
	public static ICalculoJuros setarTipo(TipoJuros tipo){
		
		
		if(tipo.equals(TipoJuros.JS)){
			return  new JurosSimples(
					Double.valueOf(pegarValor("Juros Simples \n"+"Digite o Capital")),
                    Double.valueOf(pegarValor("Juros Simples \n"+"Digite o Tempo")),
                    Double.valueOf(pegarValor("Juros Simples \n"+"Digite a Taxa")));
		}else{
			return new JurosComposto(
					Double.valueOf(pegarValor("Juros Composto \n"+"Digite o Capital")),
                    Double.valueOf(pegarValor("Juros Composto \n"+"Digite o Tempo ")),
                    Double.valueOf(pegarValor("Juros Composto \n"+"Digite a Taxa")));
		}
	}
	
			
	public static String pegarValor(String texto){
		return JOptionPane.showInputDialog(texto);
	}
}
