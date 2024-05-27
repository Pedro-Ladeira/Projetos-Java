package br.com.fiap.beans;

public class Colaborador {

	private int codigo;
	private String nome;
	private String cargo;
	private double qtdHoras;
	private double valorHora;
	private Endereco endereco;
		
	public Colaborador() {
		super();
	}
	
	public Colaborador(int codigo, String nome, String cargo, double qtdHoras, double valorHora) {
		super();
		this.codigo = codigo;
		this.nome = nome.toUpperCase();
		this.cargo = cargo;
		this.qtdHoras = qtdHoras;
		this.valorHora = valorHora;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(double qtdHoras) {
		this.qtdHoras = qtdHoras;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	//metodo worker 
	public double calcularSalario() {
		return qtdHoras * valorHora;
	} 
	
	public String informacaoSalario() {
		String informacao;
		
		if(calcularSalario() <= 18000) {
			informacao = "Abaixo do limite";}
			else {
				informacao = "Acima do limite";
			}
		return informacao;
	}
		
}
	
	

	
	
