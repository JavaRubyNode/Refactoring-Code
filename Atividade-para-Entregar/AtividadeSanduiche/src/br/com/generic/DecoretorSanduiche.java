package br.com.generic;

public class DecoretorSanduiche extends Sanduiche{
	
	private Sanduiche sanduiche;
	
	private String nome;
	private double preco;
	public Sanduiche getSanduiche() {
		return sanduiche;
	}
	public void setSanduiche(Sanduiche sanduiche) {
		this.sanduiche = sanduiche;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String Nome) {
		this.nome = Nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public DecoretorSanduiche(String Nome, double preco,Sanduiche sanduiche) {
		super(sanduiche.getNome(), sanduiche.getPreco());
		this.preco = preco;
		this.nome = Nome;
	}
	
	public void imprimir(){
		mensagem(super.getNome()+" - "+ super.getPreco());
		mensagem(this.nome+ " - "+ this.preco);
	}

}
