package br.com.fiap.beans;

public class Problema {

	private String descricao;
	private String sintomas;

	public Problema() {
		super();
	}

	public Problema(String descricao, String sintomas) {
		super();
		this.descricao = descricao;
		this.sintomas = sintomas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public String toString() {
		return "\nDescrição do Problema = " + descricao + "\nSintomas Percebidos = " + sintomas;
	}

}
