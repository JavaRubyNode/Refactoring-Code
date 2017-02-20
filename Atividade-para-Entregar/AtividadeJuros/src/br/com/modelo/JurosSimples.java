package br.com.modelo;

import br.com.generic.ICalculoJuros;

public class JurosSimples implements ICalculoJuros {

	private Double capital;
	private Double tempo;
	private Double taxa;
	
	
	
	
	@Override
	public Double calcularJuros() {
		return (getCapital()*getTempo()*(getTaxa()/100));
	}

	@Override
	public Double calcularMontante() {
		return (calcularJuros()+getCapital());
	}

	public Double getCapital() {
		return capital;
	}

	public void setCapital(Double capital) {
		this.capital = capital;
	}

	public Double getTempo() {
		return tempo;
	}

	public void setTempo(Double tempo) {
		this.tempo = tempo;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public JurosSimples(Double capital, Double tempo, Double taxa) {
		super();
		this.capital = capital;
		this.tempo = tempo;
		this.taxa = taxa;
	}

	public JurosSimples() {
		super();
	}
	
	

}
