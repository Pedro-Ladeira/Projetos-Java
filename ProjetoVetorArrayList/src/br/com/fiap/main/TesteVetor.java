package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;

public class TesteVetor {

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

		Carro[] vetorCarro = new Carro[3];

		int indice = 0;
		int resultado = 0;

		while (resultado == 0) {
			vetorCarro[indice] = new Carro();
			vetorCarro[indice].setMarca(texto("Informe a marca"));
			vetorCarro[indice].setModelo(texto("Modelo"));
			vetorCarro[indice].setCodigo(inteiro("Código"));
			vetorCarro[indice].setValor(real("Valor"));
			
			indice ++;
			
			resultado = JOptionPane.showConfirmDialog(null, "Deseja cadastrar mais algum carro?", 
					"MEUS CARROS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		}
		
		for (int contador = 0; contador < indice ; contador ++) {
			System.out.println(
					"\n\nMarca: " + vetorCarro[indice].getMarca() +
					"\nModelo: " + vetorCarro[indice].getModelo() +
					"\nCodigo: " + vetorCarro[indice].getCodigo() +
					"\nValor" + vetorCarro[indice].getValor());
		}

	}

}
