package br.com.generico;

public abstract class Opcional {
	
	private String descricao;
	private double preco;
	
	public Opcional(String descricao, double preco) {
		super();
		this.descricao = descricao;
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
