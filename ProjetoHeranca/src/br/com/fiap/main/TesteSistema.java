package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Pf;
import br.com.fiap.beans.Pj;

public class TesteSistema {

	public static void main(String[] args) {
		//String nome, String email, double valor, String cpf, String rg
		Pf objPf = new Pf(
				JOptionPane.showInputDialog("Informe o nome da PF"),
				JOptionPane.showInputDialog("digite o email"),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o valor")),
				JOptionPane.showInputDialog("Informe o CPF"),
				JOptionPane.showInputDialog("Informe o RG")
				);	
			
		//String nome, String email, double valor, String cnpj
		Pj objPj = new Pj(
				JOptionPane.showInputDialog("Informe o nome da PJ"),
				JOptionPane.showInputDialog("Digite o email"),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o valor")),
				JOptionPane.showInputDialog("Informe o CNPJ")
				);
		
		System.out.println("--DADOS DA PESSOA FÍSICA--" + 
				"\nNome: " + objPf.getNome() + 
				"\nEmail: " + objPf.getEmail() +
				"\nValor: " + objPf.getValor() + 
				"\nCPF: " + objPf.getCpf() +
				"\nRG: " + objPf.getRg() + 
				"\nIdentificador: " + objPf.identificar() + 
				"\n\n--DADOS DA PESSOA JURÍDICA--" + 
				"\nNome: " + objPj.getNome() + 
				"\nEmail: " + objPj.getEmail() +
				"\nValor: " + objPj.getValor() +
				"\nCNPJ: " + objPj.getCnpj() + 
				"\nIdentificador: " + objPj.identificar()
				);
	}

}
