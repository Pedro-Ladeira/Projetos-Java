package br.com.fiap.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;

public class TesteArray {
	
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

		// Prepara a lista para adicionar itens 
		ArrayList<Carro> listaCarros = new ArrayList<Carro>();
		
		int resultado = 0;
		
		Carro objCarro;
		
		while(resultado == 0) {
			objCarro = new Carro(
					texto("Informe a marca"),
					texto("Modelo"),
					inteiro("Informe o código"),
					real("Informe o valor")
					);
			
			listaCarros.add(objCarro);
			
			resultado = JOptionPane.showConfirmDialog(null, "Cadastrar mais algum carro?", "CADASTRO DE CARROS", 
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		for (Carro c : listaCarros) {
			System.out.println(
					"\nMarca: " + c.getMarca() +
					"\nModelo: " + c.getModelo() + 
					"\nCodigo: " + c.getCodigo() +
					"\nValor: " + c.getValor()
					);
		}
	}

}
