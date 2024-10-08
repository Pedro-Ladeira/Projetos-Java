package br.com.fiap.beans;

public class Moto extends Veiculo {

	private String partida;
	private int qtdCilindros;
	private Problema problema;

	public Moto() {
		super();
	}

	public Moto(String tipo, String placa, String marca, String modelo, int ano, String partida, int qtdCilindros) {
		super(tipo, placa, marca, modelo, ano);
		this.partida = partida;
		this.qtdCilindros = qtdCilindros;
	}

	public String getPartida() {
		return partida;
	}

	public void setPartida(String partida) {
		this.partida = partida;
	}

	public int getQtdCilindros() {
		return qtdCilindros;
	}

	public void setQtdCilindros(int qtdCilindros) {
		this.qtdCilindros = qtdCilindros;
	}

	public Problema getProblema() {
		return problema;
	}

	public void setProblema(Problema problema) {
		this.problema = problema;
	}

	public String toString() {
		return "\nTipo de Partida = " + partida + "\nQuantidade de Cilindros = " + qtdCilindros + "\nTipo = " + getTipo() + "\nPlaca = " + getPlaca() + "\nMarca = " + getMarca()
		+ "\nModelo = " + getModelo() + "\nAno = " + getAno();
	}

	public String identificar() {
		return "\n\nINFORMAÇÕES DA MOTO";
	}
}
