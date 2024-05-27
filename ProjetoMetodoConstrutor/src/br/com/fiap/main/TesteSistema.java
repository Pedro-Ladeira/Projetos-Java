package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {
		
		//int codigo, String nome, String cargo, double qtdHoras, double valorHora
		Colaborador objColaborador = new Colaborador(
				Integer.parseInt(JOptionPane.showInputDialog("Informe o código do colaborador")), 
				JOptionPane.showInputDialog("Informe o nome do colaborador"),
				JOptionPane.showInputDialog("Informe o cargo"),
				Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por hora"))			
				);
		
		//String logradouro, int numero, String cep, String bairro
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Informe o logradouro"),
				Integer.parseInt(JOptionPane.showInputDialog("Informe o número da residência")),
				JOptionPane.showInputDialog("Infome o CEP"),
				JOptionPane.showInputDialog("Informe o bairro")
				);
		
		objColaborador.setEndereco(objEndereco);
		
		
		System.out.println("DADOS DO COLABORADOR" +
							"\nCódigo: " + objColaborador.getCodigo() +
							"\nNome: " + objColaborador.getNome() +
							"\nCargo: " + objColaborador.getCargo() + 
							"\nQuantidade de horas: " + objColaborador.getQtdHoras() + 
							"\nValor por hora: " + objColaborador.getValorHora() + 
							"\n\nENDEREÇO" + 
							"\nLogradouro: " + objEndereco.getLogradouro() +
							"\nNúmero: " + objEndereco.getNumero() + 
							"\nCEP: " + objEndereco.getCep() +
							"\nBairro: " 
							);
		System.out.println("SALARIO DO COLABORADOR: " + objColaborador.calcularSalario());
		
		System.out.println("\nINFORMAÇÃO: " + objColaborador.informacaoSalario());

	}

}
