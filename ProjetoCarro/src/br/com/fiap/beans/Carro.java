package br.com.fiap.beans;

public class Carro extends Veiculo {
	
	private String volante;

	public Carro() {
		super();
	}

	public Carro(String placa, String marca, String modelo, int ano, double valor, String volante) {
		super(placa, marca, modelo, ano, valor);
		this.volante = volante;
	}

	@Override
	public String toString() {
		return "Carro [volante=" + volante + ", getVolante()=" + getVolante() + ", getPlaca()=" + getPlaca()
				+ ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getAno()=" + getAno()
				+ ", getValor()=" + getValor() + ", getClass()=" + getClass() + "]";
	}

	public String getVolante() {
		return volante;
	}

	public void setVolante(String volante) {
		this.volante = volante;
	}
	
	

}
