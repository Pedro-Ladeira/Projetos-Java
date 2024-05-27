package br.com.fiap.beans;

public class Endereco {

	private String logradouro;
	private String cep;
	
	public Endereco() {
		super();
	}
	
	public Endereco(String logradouro, String cep) {
		super();
		this.logradouro = logradouro;
		this.cep = cep;
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
	
	
}
