package br.com.modelo;

import br.com.generico.SalarioDev;

public class DevNew {
	
	private String nome;
	private String cpf;
	private double salarioBase;
	private SalarioDev regraSalario;
	
	public DevNew(String nome, String cpf, double salarioBase,
			SalarioDev regraSalario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
		this.regraSalario = regraSalario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public SalarioDev getRegraSalario() {
		return regraSalario;
	}
	public void setRegraSalario(SalarioDev regraSalario) {
		this.regraSalario = regraSalario;
	}
	
	public double calcularSalario() {
		return getRegraSalario().calcularSalario(getSalarioBase());
	}
	
	

}
