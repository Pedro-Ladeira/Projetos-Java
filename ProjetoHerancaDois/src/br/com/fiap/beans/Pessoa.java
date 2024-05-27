package br.com.fiap.beans;

public abstract class Pessoa {

	private String nome;
	private String email;
	private double valor;
	private Endereco endereco;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String email, double valor) {
		super();
		this.nome = nome;
		this.email = email;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", valor=" + valor + ", endereco=" + endereco
				+ ", getNome()=" + getNome() + ", getEmail()=" + getEmail() + ", getValor()=" + getValor()
				+ ", getEndereco()=" + getEndereco() + ", identificar()=" + identificar() + ", getClass()=" + getClass()
				+ "]";
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public abstract String identificar();
}
