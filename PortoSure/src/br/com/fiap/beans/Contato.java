package br.com.fiap.beans;

public class Contato {

	private String numTel;
	private String email;

	public Contato() {
		super();
	}

	public Contato(String numTel, String email) {
		super();
		this.numTel = numTel;
		this.email = email;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "\n\n--Contato--\nNúmero de telefone = " + numTel + "\nEmail = " + email;
	}

	
	
}
