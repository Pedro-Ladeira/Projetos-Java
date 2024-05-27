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
	

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", cep=" + cep + ", getLogradouro()=" + getLogradouro()
				+ ", getCep()=" + getCep() + ", getClass()=" + getClass() + "]";
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
