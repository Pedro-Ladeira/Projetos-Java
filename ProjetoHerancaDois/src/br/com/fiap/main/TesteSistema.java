package br.com.fiap.main;

import javax.swing.JOptionPane;

/*import br.com.fiap.beans.Endereco;*/
import br.com.fiap.beans.Pf;
import br.com.fiap.beans.Pj;

public class TesteSistema {

	public static void main(String[] args) {

		Pf objPf = new Pf(
				JOptionPane.showInputDialog("Nome da Pessoa Física"),
				JOptionPane.showInputDialog("Email da Pessoa Física"),
				Double.parseDouble(JOptionPane.showInputDialog("Salário")),
				JOptionPane.showInputDialog("CPF"),
				JOptionPane.showInputDialog("RG"));
		
		Pj objPj = new Pj(
				JOptionPane.showInputDialog("Nome da Pessoa Jurídica"),
				JOptionPane.showInputDialog("Email da Pessoa Jurídica"),
				Double.parseDouble(JOptionPane.showInputDialog("Receita")),
				JOptionPane.showInputDialog("CNPJ"),
				JOptionPane.showInputDialog("Razão Social"));
		
		/*Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Logradouro"),
				JOptionPane.showInputDialog("CEP"));*/
		
		System.out.println(objPf +
				"\n\n" + objPj);
	}

}
