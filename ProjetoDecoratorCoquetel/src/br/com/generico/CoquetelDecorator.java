package br.com.generico;

public class CoquetelDecorator extends Coquetel {	
	private Coquetel coquetel;
	private String nome;
	private double preco;

	public CoquetelDecorator(String nome, double preco, Coquetel coquetel) {
		super(coquetel.getNome(), coquetel.getPreco());
		this.nome = nome;
		this.preco = preco;
	}
	public Coquetel getCoquetel() {
		return coquetel;
	}
	public void setCoquetel(Coquetel coquetel) {
		this.coquetel = coquetel;
	}	
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
	public void imprimirComposicao() {
		System.out.println(super.getNome() + " " + super.getPreco());
		System.out.println(this.nome + " " + this.preco);
	}	
}
