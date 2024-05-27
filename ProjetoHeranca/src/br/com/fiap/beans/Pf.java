package br.com.fiap.beans;

public class Pf extends Pessoa {

	private String cpf;
	private String rg;

	public Pf() {
		super();
	}

	public Pf(String nome, String email, double valor, String cpf, String rg) {
		super(nome, email, valor);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String identificar() {
		// TODO Auto-generated method stub
		return "Resultado Pessoa Física";
	}

}
