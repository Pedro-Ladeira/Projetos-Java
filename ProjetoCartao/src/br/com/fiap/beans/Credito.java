package br.com.fiap.beans;

public class Credito extends Cartao {

	public Credito() {
		super();
	}

	public Credito(String banco, String bandeira, String validade, int cvv, int numero, double saldo, double compra) {
		super(banco, bandeira, validade, cvv, numero, saldo, compra);
	}

	@Override
	public double limite() {
		return saldo + (30 * saldo / 100);
	}

	@Override
	public String status() {
		String aviso = null;
		if (compra > limite()) {
			aviso = "Limite Excedido";
		} else {
			aviso = "Compra Aprovada";
		}
		return aviso;
	}
}
