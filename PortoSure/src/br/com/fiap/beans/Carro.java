package br.com.fiap.beans;

public class Carro extends Veiculo {

	private String carroceria;
	private String transmissao;
	private String tracao;
	private Problema problema;

	public Carro() {
		super();
	}

	public Carro(String tipo, String placa, String marca, String modelo, int ano, String carroceria, String transmissao,
			String tracao) {
		super(tipo, placa, marca, modelo, ano);
		this.carroceria = carroceria;
		this.transmissao = transmissao;
		this.tracao = tracao;
	}

	public String getCarroceria() {
		return carroceria;
	}

	public void setCarroceria(String carroceria) {
		this.carroceria = carroceria;
	}

	public String getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(String transmissao) {
		this.transmissao = transmissao;
	}

	public String getTracao() {
		return tracao;
	}

	public void setTracao(String tracao) {
		this.tracao = tracao;
	}

	public Problema getProblema() {
		return problema;
	}

	public void setProblema(Problema problema) {
		this.problema = problema;
	}

	public String toString() {
		return "\nCarroceria = " + carroceria + "\nTransmissão = " + transmissao + "\nTipo de Tração = " + tracao
				+ "\nTipo = " + getTipo() + "\nPlaca = " + getPlaca() + "\nMarca = " + getMarca()
				+ "\nModelo = " + getModelo() + "\nAno = " + getAno();
	}

	public String identificar() {
		return "\n\nINFORMAÇÕES DO CARRO";
	}

	
}
