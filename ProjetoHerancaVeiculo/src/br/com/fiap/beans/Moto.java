package br.com.fiap.beans;

public class Moto extends Veiculo {

	private String guidao;

	public Moto() {
		super();
	}

	public Moto(String placa, String marca, String modelo, int ano, double valor, String guidao) {
		super(placa, marca, modelo, ano, valor);
		this.guidao = guidao;
	}

	public String getGuidao() {
		return guidao;
	}

	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}

	public String toString() {
		return "\nGuidao= " + guidao + "\nPlaca= " + getPlaca() + "\nMarca= " + getMarca() + "\nModelo= "
				+ getModelo() + "\nAno= " + getAno() + "\nValor= " + getValor();
	}

	public String identificar() {
		return "INFORMAÇÕES DA MOTO";
	}

	
}
