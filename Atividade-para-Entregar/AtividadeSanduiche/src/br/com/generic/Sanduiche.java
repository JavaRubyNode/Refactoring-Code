package br.com.generic;

import javax.swing.JOptionPane;

public abstract class Sanduiche {
	
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
	public Sanduiche(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	public Sanduiche() {
		super();
	}
	
	public void mensagem(String texto){
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public  String pegarValor(String texto){
		return JOptionPane.showInputDialog(texto);
	}
	
	public void imprimir(){
		mensagem(getNome()+" - "+ getPreco());
	}
	
	

}