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

	@Override
	public String toString() {
		return "Pf [cpf=" + cpf + ", rg=" + rg + ", getCpf()=" + getCpf() + ", getRg()=" + getRg() + ", identificar()="
				+ identificar() + ", toString()=" + super.toString() + ", getNome()=" + getNome() + ", getEmail()="
				+ getEmail() + ", getValor()=" + getValor() + ", getEndereco()=" + getEndereco() + "]";
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

	public String identificar() {
		return "Informações da Pessoa Física";
		}
}
