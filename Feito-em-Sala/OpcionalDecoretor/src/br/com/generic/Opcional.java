package br.com.generic;

public abstract class Opcional {
	
	private String descricao;
	private double preco;
	
	
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
	public Opcional(String descricao, double preco) {
		super();
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void imprimir(){
		System.out.println(getDescricao()+" - "+getPreco());
	}
	
	

}
