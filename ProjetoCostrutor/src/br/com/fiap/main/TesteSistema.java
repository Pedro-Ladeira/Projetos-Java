package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {

		//int codigo, String nome, String cargo, double valorHora, double qtdHoras
		Colaborador objColaborador = new Colaborador(
				Integer.parseInt(JOptionPane.showInputDialog("Codigo")),
				JOptionPane.showInputDialog("Nome"),
				JOptionPane.showInputDialog("Cargo"),
				Double.parseDouble(JOptionPane.showInputDialog("Valor Hora")),
				Double.parseDouble(JOptionPane.showInputDialog("Quantidade Horas"))
				);
		
		//String logradouro, int numero, String cep
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Logradouro"),
				Integer.parseInt(JOptionPane.showInputDialog("Número")),
				JOptionPane.showInputDialog("CEP")
				);
		
		objColaborador.setEndereco(objEndereco);
		
		System.out.println("DADOS DO COLABORADOR" +
				"\nCódigo: " + objColaborador.getCodigo() + 
				"\nNome: " + objColaborador.getNome() +
				"\nCargo: " + objColaborador.getCargo() + 
				"\nValor por hora: " + objColaborador.getValorHora() + 
				"\nQuantidade de horas: " + objColaborador.getQtdHoras() +
				"\n\nENDEREÇO" + 
				"\nLogradouro: " + objEndereco.getLogradouro() + 
				"\nNúmero: " + objEndereco.getNumero() + 
				"\nCEP: " + objEndereco.getCep());
	
	}

}
