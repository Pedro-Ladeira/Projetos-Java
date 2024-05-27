package br.com.fiap.beans;

public class Pagamento {

	private String tipo;
	private int numCartao;
	private String bandeira;
	private String nome;
	private double valor;
	private double saldoConta; // Novo atributo saldo da conta

	public Pagamento() {
		super();
	}

	public Pagamento(String tipo, int numCartao, String bandeira, String nome, double valor, double saldoConta) {
		super();
		this.tipo = tipo;
		this.numCartao = numCartao;
		this.bandeira = bandeira;
		this.nome = nome;
		this.valor = valor;
		this.saldoConta = saldoConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(int numCartao) {
		this.numCartao = numCartao;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	@Override
	public String toString() {
		return "\n\n--Pagamento--\nTipo de pagamento = " + tipo + "\nNúmero do cartão = " + numCartao + "\nBandeira do cartão = " 
				+ bandeira + "\nNome cadastrado = " + nome
				+ "\nValor do serviço = " + valor + "\nSaldo da conta = " + saldoConta;
	}
	
	// Método para verificar se o valor do serviço é maior que o saldo da conta
	public String verificarPagamento() {
		if (valor > saldoConta) {
			return "Pagamento reprovado: saldo insuficiente.";
		} else {
			return "Pagamento aprovado.";
		}
	}

}
