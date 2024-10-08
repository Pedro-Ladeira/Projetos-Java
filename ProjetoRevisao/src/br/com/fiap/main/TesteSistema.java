package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.PessoaFisica;
import br.com.fiap.beans.PessoaJuridica;

public class TesteSistema {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) {

		
		//String nome, String email, int idade, double valor, String rg, String cpf
		PessoaFisica objPf = new PessoaFisica(
				texto("Informe o nome da Pessoa Física"),
				texto("Informe o email da Pessoa Física"),
				inteiro("Informe a idade da Pessoa Física"),
				real("Informe o salário da Pessoa Física"),
				texto("Informe o RG"),
				texto("Informe o CPF")
				);
		
		Endereco objEnderecoPf = new Endereco(
				texto("Informe o logradouro da pessoa física"),
				texto("Informe o CEP"),
				inteiro("Informe o número")
				);
		
		objPf.setEndereco(objEnderecoPf);
		
		PessoaJuridica objPj = new PessoaJuridica(
				texto("Informe o nome da empresa"),
				texto("Informe o email da empresa"),
				inteiro("Informe o tempo de mercado da empresa"),
				real("Informe a receita da empresa"),
				texto("Informe a Razão Social"),
				texto("Informe o CNPJ")
				);
		
		Endereco objEnderecoPj = new Endereco(
				texto("Logradouro da empresa"),
				texto("CEP da empresa"),
				inteiro("Número de residência da empresa")
				);
		
		objPj.setEndereco(objEnderecoPj);
		
		System.out.println(objPf.identificar() + objPf + objEnderecoPf + objPj.identificar() + 
				objPj + objEnderecoPj);
	}

}
