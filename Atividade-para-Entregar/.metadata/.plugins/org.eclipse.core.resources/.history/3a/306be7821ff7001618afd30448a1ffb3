package br.com.modelo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.generic.ICalculoJuros;
import br.com.generic.TipoJuros;

public class Banco {
	 
	
	public void executar(TipoJuros ...juros){
		
		DecimalFormat format = new DecimalFormat("#.##");
		
		ICalculoJuros calculo;
		
		List<TipoJuros> listaTipo = Arrays.asList(juros);
		for (TipoJuros tipoJuros : listaTipo) {
			calculo = FactoryCalculo.setarTipo(tipoJuros);
			
			mensagem(
			"O Valor do Juros = "+format.format(calculo.calcularJuros())+"\n"+
			"O Valor do Montante = " +format.format(calculo.calcularMontante()));
		}
		
	}
	
		
	
	public void mensagem(String texto){
		JOptionPane.showMessageDialog(null, texto);
	}
	
	
	
	
	
	

}
