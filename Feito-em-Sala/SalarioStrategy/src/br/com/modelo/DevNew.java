package br.com.modelo;

import br.com.generico.SalarioDev;

public class DevNew {

	private String nome;
	private String cpf;
	private double salarioBase;
	private SalarioDev regrasalario;
	
	
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
	public SalarioDev getRegrasalario() {
		return regrasalario;
	}
	public void setRegrasalario(SalarioDev regrasalario) {
		this.regrasalario = regrasalario;
	}
	public DevNew(String nome, String cpf, double salarioBase, SalarioDev regrasalario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
		this.regrasalario = regrasalario;
	}
	public DevNew() {
		super();
	}
	
	public double calcularSalario(){
		return getRegrasalario().calcularSalario(getSalarioBase());
	}
	
	
}
