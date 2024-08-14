package br.com.fiap.beans;

public class Contato {

	private String email;
	private String numTel;

	public Contato() {
		super();
	}

	public Contato(String email, String numTel) {
		super();
		this.email = email;
		this.numTel = numTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

}
