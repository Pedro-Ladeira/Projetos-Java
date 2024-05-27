package br.com.fiap.beans;

public class PessoaJuridica extends Pessoa {

	private String razaoSocial;
	private String cnpj;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, String email, int idade, double valor, String razaoSocial, String cnpj) {
		super(nome, email, idade, valor);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String identificar() {
		return "\n\nINFORMAÇÕES DA PESSOA JURÍDICA";
	}

	public String toString() {
		return "\nRazão Social= " + razaoSocial + "CNPJ= " + cnpj + "\nNome= " + getNome()
				+ "\nEmail= " + getEmail() + "\nTempo de Mercado= " + getIdade() + "\nReceita= " + getValor();
	}

	
}
