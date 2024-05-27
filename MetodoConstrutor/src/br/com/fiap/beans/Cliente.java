package br.com.fiap.beans;

public class Cliente {

	private int codigo;
	private String nome;
	private double renda;
	private Endereco endereco;
	
	public Cliente() {
		super();
	}


	public Cliente(int codigo, String nome, double renda) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.renda = renda;
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


	public double getRenda() {
		return renda;
	}


	public void setRenda(double renda) {
		this.renda = renda;
	}


	public Endereco getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	
}
