package br.com.generic;

public abstract class Coquetel {
	
	
	private String nome;
	private double preco;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Coquetel(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public Coquetel() {
		super();
	}
	
	public void imprimir(){
		System.out.println(getNome()+" - "+getPreco());
	}
	

}
