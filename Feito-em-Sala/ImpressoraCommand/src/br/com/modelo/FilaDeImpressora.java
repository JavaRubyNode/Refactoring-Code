package br.com.modelo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import br.com.generic.IImpressora;

public class FilaDeImpressora {

	private List<IImpressora> listaImpressora;

	public List<IImpressora> getListaImpressora() {
		return listaImpressora;
	}

	public void setListaImpressora(List<IImpressora> listaImpressora) {
		this.listaImpressora = listaImpressora;
	}
		
	public FilaDeImpressora() {
		super();
		this.listaImpressora = new ArrayList<IImpressora>();
	}
	
	public void adicionarImpressora(IImpressora impressora) {
		getListaImpressora().add(impressora);
	}	
	
	
	public void addImpressora(IImpressora ...Impressoras){
		setListaImpressora(Arrays.asList(Impressoras));
	}
	
	
	
	public void executarFila(IImpressora ...Impressoras) {
		   
		  addImpressora(Impressoras);
		
		for (IImpressora impressora : getListaImpressora()) {
			impressora.imprimir();
		}
	}	
	
}
