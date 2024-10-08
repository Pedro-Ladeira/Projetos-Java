package br.com.fiap.beans;

public class Usuario {

	private int codigo;
	private String login;
	private String senha;

	public Usuario() {
		super();
	}

	public Usuario(int codigo, String login, String senha) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.senha = senha;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String toString() {
		return "\n\n--Usuario--\nCódigo = " + codigo + "\nLogin = " + login + "\nSenha = " + senha;
	}

}
