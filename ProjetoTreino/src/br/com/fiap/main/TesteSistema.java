package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Colaborador;
import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

public class TesteSistema {

	public static void main(String[] args) {

		Colaborador objColaborador = new Colaborador(
				Integer.parseInt(JOptionPane.showInputDialog("Informe o registro do colaborador")),
				JOptionPane.showInputDialog("Informe o nome do colaborador"),
				JOptionPane.showInputDialog("Informe o cargo do colaborador"),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do colaborador"))
				);
	
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Informe o logradouro"),
				JOptionPane.showInputDialog("Informe o CEP"));
		
		objColaborador.setEndereco(objEndereco);
		
		Empresa objEmpresa = new Empresa(
				JOptionPane.showInputDialog("Informe o CNPJ da empresa"),
				JOptionPane.showInputDialog("Informe a razão social da empresa"));
				
		System.out.println("--DADOS DO COLABORADOR--" + 
				"\nRegistro: " + objColaborador.getRegistro() + 
				"\nNome: " + objColaborador.getNome() + 
				"\nCargo: " + objColaborador.getCargo() + 
				"\nSalário: " + objColaborador.getSalario() +
				"\nENDEREÇO" +
				"\nLogradouro: " + objColaborador.getEndereco().getLogradouro() + 
				"\nCEP: " + objColaborador.getEndereco().getCep() + 
				"\n\n--DADOS DA EMPRESA--" +
				"\nCPNJ: " + objEmpresa.getCnpj() + 
				"\nRazão Social: " + objEmpresa.getRazaoSocial());
	}
}
