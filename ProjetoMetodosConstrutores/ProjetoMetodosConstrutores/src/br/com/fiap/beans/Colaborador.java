package br.com.fiap.beans;

public class Colaborador {

	// visibilidade, tipo de dados e atributos
	private int registro;
	private String nome;
	private String cargo;
	private double salario;	
	private Endereco endereco;  // atributo de referencia
	
	// metodo construtor vazio 
	public Colaborador() {
		super();
	}
	
	
	// metodo construtor cheio (sem atributo de referencia)
	public Colaborador(int registro, String nome, String cargo, double salario) {
		super();
		this.registro = registro;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}


	// Setters (entrada) e Getters (retornar)
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
