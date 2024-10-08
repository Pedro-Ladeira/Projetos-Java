package br.com.fiap.beans;

public class Endereco {

	private String logradouro;
	private String cep;
	private int numero;

	public Endereco() {
		super();
	}

	public Endereco(String logradouro, String cep, int numero) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Endereco\nLogradouro= " + logradouro + "\nCEP= " + cep + "\nNúmero= " + numero;
	}

}
