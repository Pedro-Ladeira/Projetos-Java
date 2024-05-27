package br.com.fiap.beans;

public abstract class Pessoa {

	private String nome;
	private String email;
	private double valor;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String email, double valor) {
		super();
		this.nome = nome;
		this.email = email;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public abstract String identificar();

}
