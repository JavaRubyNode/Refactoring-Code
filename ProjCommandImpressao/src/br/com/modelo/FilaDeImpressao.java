package br.com.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.generico.Impressora;

public class FilaDeImpressao {	
	private List<Impressora> listaImp;
	public FilaDeImpressao() {
		super();
		this.listaImp = new ArrayList<Impressora>();
	}
	public List<Impressora> getListaImp() {
		return listaImp;
	}
	public void setListaImp(List<Impressora> listaImp) {
		this.listaImp = listaImp;
	}
	public void adicionarImpressora(Impressora impressora) {
		getListaImp().add(impressora);
	}	
	public void executarFila() {
		for (Impressora impressora : getListaImp()) {
			System.out.println("Validação");
			impressora.imprimir();
		}
	}	
}
