package br.com.fiap.beans;

public class Oficinas {

	private String nome;
	private String especialidade;
	private String cnpj;
	private Endereco endereco;
	private Contato contato;
	private Agendamento agenda;
	private Veiculo veiculo;

	public Oficinas() {
		super();
	}

	public Oficinas(String nome, String especialidade, String cnpj) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public Agendamento getAgenda() {
		return agenda;
	}

	public void setAgenda(Agendamento agenda) {
		this.agenda = agenda;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public String toString() {
		return "\nNome = " + nome + "\nEspecialidade de serviços = " + especialidade + "\nCNPJ = " + cnpj;
	}

	public String identificar() {
		return "\n\n\n--INFORMAÇÕES DA OFICINA--";
	}
}
