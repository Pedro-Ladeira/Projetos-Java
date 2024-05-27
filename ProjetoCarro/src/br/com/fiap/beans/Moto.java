package br.com.fiap.beans;

public class Moto extends Veiculo{
	
	private String marcaGuidao;

	public Moto() {
		super();
	}

	public Moto(String placa, String marca, String modelo, int ano, double valor, String marcaGuidao) {
		super(placa, marca, modelo, ano, valor);
		this.marcaGuidao = marcaGuidao;
	}

	@Override
	public String toString() {
		return "Moto [marcaGuidao=" + marcaGuidao + ", getMarcaGuidao()=" + getMarcaGuidao() + ", getPlaca()="
				+ getPlaca() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getAno()=" + getAno()
				+ ", getValor()=" + getValor() + ", getClass()=" + getClass() + "]";
	}

	public String getMarcaGuidao() {
		return marcaGuidao;
	}

	public void setMarcaGuidao(String marcaGuidao) {
		this.marcaGuidao = marcaGuidao;
	}

}
