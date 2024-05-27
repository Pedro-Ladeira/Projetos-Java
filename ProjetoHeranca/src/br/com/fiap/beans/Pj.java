package br.com.fiap.beans;

public class Pj extends Pessoa {

	private String cnpj;

	public Pj() {
		super();
	}

	public Pj(String nome, String email, double valor, String cnpj) {
		super(nome, email, valor);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String identificar() {
		// TODO Auto-generated method stub
		return "Resultado Pessoa Jurídica";
	}

}