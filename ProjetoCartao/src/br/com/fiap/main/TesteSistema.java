package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Credito;
import br.com.fiap.beans.Debito;

public class TesteSistema {

	public static void main(String[] args) {
		
		Debito objDebito = new Debito(
				JOptionPane.showInputDialog("Informe o banco"),
				JOptionPane.showInputDialog("Bandeira de Debito"),
				JOptionPane.showInputDialog("Validade"),
				Integer.parseInt(JOptionPane.showInputDialog("CVV")),
				Integer.parseInt(JOptionPane.showInputDialog("Número do cartão de debito")),
				Double.parseDouble(JOptionPane.showInputDialog("Saldo")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor da compra")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor do consignado"))
				);

		Credito objCredito = new Credito(
				JOptionPane.showInputDialog("Informe o banco"),
				JOptionPane.showInputDialog("Bandeira de Debito"),
				JOptionPane.showInputDialog("Validade"),
				Integer.parseInt(JOptionPane.showInputDialog("CVV")),
				Integer.parseInt(JOptionPane.showInputDialog("Número do cartão de debito")),
				Double.parseDouble(JOptionPane.showInputDialog("Saldo")),
				Double.parseDouble(JOptionPane.showInputDialog("Valor da compra"))
				);
		
		System.out.println("Limite do Debito: " + objDebito.limite() +
				"\nValor da compra no Debito: " + objDebito.getCompra() +
				"\nStatus de aprovação Debito: " + objDebito.status() + 
				"\n\nLimite do Credito: " + objCredito.limite() + 
				"\nValor da compra do Credito: " + objCredito.getCompra() + 
				"\nStatus de aprovação Credito: " + objCredito.status());
		
	}

}
