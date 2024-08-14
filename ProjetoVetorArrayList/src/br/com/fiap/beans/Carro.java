package br.com.fiap.beans;

public class Carro {

	private String marca;
	private String modelo;
	private int codigo;
	private double valor;

	public Carro() {
		super();
	}

	public Carro(String marca, String modelo, int codigo, double valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.codigo = codigo;
		this.valor = valor;
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
