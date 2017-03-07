package br.com.generico;

public class OpcionalDecorator extends Opcional {

	private Opcional opcional;
	private String descricao;
	private double preco;
	
	public OpcionalDecorator(String descricao, double preco, Opcional opcional) {
		super(opcional.getDescricao(), opcional.getPreco());
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Opcional getOpcional() {
		return opcional;
	}

	public void setOpcional(Opcional opcional) {
		this.opcional = opcional;
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

	public void imprimir() {
		System.out.println(super.getDescricao() +  " " + super.getPreco());
		System.out.println(getDescricao() + " " + getPreco());
	}

}
