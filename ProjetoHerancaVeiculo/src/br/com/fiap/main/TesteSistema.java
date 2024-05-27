package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Moto;

public class TesteSistema {
	
	public static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	public static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	public static void main(String[] args) {

		Carro objCarro = new Carro(
				texto("Placa do carro"),
				texto("Marca do carro"),
				texto("Modelo do carro"),
				inteiro("Ano do carro"),
				real("Valor do carro"),
				texto("Volante do carro"));
		
		Moto objMoto = new Moto(
				texto("Placa da moto"),
				texto("Marca da moto"),
				texto("Modelo da moto"),
				inteiro("Ano da moto"),
				real("Valor da moto"),
				texto("Guidão da moto"));
		
		System.out.println(objCarro.identificar() + objCarro + "\n\n" +
							objMoto.identificar() + objMoto);
		
	}

}
