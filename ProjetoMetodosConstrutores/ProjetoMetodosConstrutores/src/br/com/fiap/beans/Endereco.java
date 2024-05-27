package br.com.fiap.beans;

public class Endereco {

	// Visibilidade, tipo de dados e atributos
	private String logradouro;
	private int numero;
	private String complemento;
	private String cep;
	private String bairro;

	// metodo construtor vazio
	public Endereco() {
		super();
	}

	// metodo construtor cheio
	public Endereco(String logradouro, int numero, String complemento, String cep, String bairro) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
	}

	// Setters (entrada) e Getters (retornar)
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
