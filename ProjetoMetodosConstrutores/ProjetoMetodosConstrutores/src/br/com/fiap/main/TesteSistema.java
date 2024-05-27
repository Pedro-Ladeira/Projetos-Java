package br.com.fiap.main;



import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {
		// Instanciar objetos 
	
		
		// int registro, String nome, String cargo, double salario
		Colaborador objColaborador = new Colaborador(
				Integer.parseInt(JOptionPane.showInputDialog("Informe o registro do colaborador")),
				JOptionPane.showInputDialog("Informe o nome do colaborador"),
				JOptionPane.showInputDialog("Informe o cargo do colaborador"),
				Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do colaborador"))
				);
		
		// String logradouro, int numero, String complemento, String cep, String bairro
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Informe o logradouro"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o numero")),
				JOptionPane.showInputDialog("Digite o complemento"),
				JOptionPane.showInputDialog("Informe o CEP"),
				JOptionPane.showInputDialog("Informe o bairro")
				);
		
		objColaborador.setEndereco(objEndereco);
		
		// String cnpj, String razaoSocial
		Empresa objEmpresa = new Empresa(
				JOptionPane.showInputDialog("Informe o CNPJ da Empresa"),
				JOptionPane.showInputDialog("informe o nome da Empresa")
				);
		
		// Saidas
		System.out.println(
				"INFORMAÇÕES DO COLABORADOR" + 
				"\nNumero de registro: " + objColaborador.getRegistro() + 
				"\nNome: " + objColaborador.getNome() + 
				"\nCargo: " + objColaborador.getCargo() + 
				"\nSalario: " + objColaborador.getSalario() + 
				"\nENDEREÇO" +
				"\nLogradouro: " + objColaborador.getEndereco().getLogradouro() + 
				"\nNumero: " + objColaborador.getEndereco().getNumero() + 
				"\nComplemento: " + objColaborador.getEndereco().getComplemento() + 
				"\nCEP: " + objColaborador.getEndereco().getCep() + 
				"\nBairro: " + objColaborador.getEndereco().getBairro() + 
				"\n\n\nINFORMAÇÕES DA EMPRESA" + 
				"\nCNPJ: " + objEmpresa.getCnpj() + 
				"\nNome da Empresa: " + objEmpresa.getRazaoSocial()				
				);		
		

	}

}
