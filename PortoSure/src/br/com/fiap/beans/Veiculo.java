package br.com.fiap.beans;

public abstract class Veiculo {

	private String tipo;
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private Oficinas oficina;
	

	public Veiculo() {
		super();
	}

	public Veiculo(String tipo, String placa, String marca, String modelo, int ano) {
		super();
		this.tipo = tipo; 
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Oficinas getOficina() {
		return oficina;
	}

	public void setOficina(Oficinas oficina) {
		this.oficina = oficina;
	}

	public abstract String identificar();

}
