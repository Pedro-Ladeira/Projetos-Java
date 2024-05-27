package br.com.fiap.beans;

public class Empresa {

	// visibilidade, tipo de dados e atributos
	private String cnpj;
	private String razaoSocial;

	// metodo construtor vazio
	public Empresa() {
		super();
	}

	// metodo construtor cheio
	public Empresa(String cnpj, String razaoSocial) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	// Setters (entrada) e Getters (retornar)
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
