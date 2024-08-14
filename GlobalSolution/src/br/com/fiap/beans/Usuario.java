package br.com.fiap.beans;

public class Usuario {

	private String cpf;
	private String nome;
	private String email;
	private String senha;
	private Endereco endereco;
	private Contato contato;

	public Usuario() {
		super();
	}

	public Usuario(String cpf, String nome, String email, String senha) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	@Override
	public String toString() {
		return "Usuario [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}

}
