package br.com.fiap.beans;

public class Colaborador {

	private int codigo;
	private String nome;
	private String cargo;
	private double valorHora;
	private double qtdHoras;
	private Endereco endereco;
	
	
	//metodo construtor vazio
	public Colaborador() {
		super();
	}

	//metodo construtor cheio
	public Colaborador(int codigo, String nome, String cargo, double valorHora, double qtdHoras) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.valorHora = valorHora;
		this.qtdHoras = qtdHoras;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getQtdHoras() {
		return qtdHoras;
	}
	public void setQtdHoras(double qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
