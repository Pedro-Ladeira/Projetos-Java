package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Moto;

public class TesteSistema {

	public static void main(String[] args) {

		Carro objCarro = new Carro(JOptionPane.showInputDialog("Informa a placa do carro"),
				JOptionPane.showInputDialog("Informe a marca do carro"),
				JOptionPane.showInputDialog("informe o modelo do carro"),
				Integer.parseInt(JOptionPane.showInputDialog("informe o ano do carro")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro")),
				JOptionPane.showInputDialog("Informe a marca do volante"));

		Moto objMoto = new Moto(JOptionPane.showInputDialog("Informa a placa da moto"),
				JOptionPane.showInputDialog("Informe a marca da moto"),
				JOptionPane.showInputDialog("informe o modelo da moto"),
				Integer.parseInt(JOptionPane.showInputDialog("informe o ano da moto")),
				Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da moto")),
				JOptionPane.showInputDialog("Informe a marca do guidão"));

		/*System.out.println("--DADOS DO CARRO--" + 
				"\nPlaca: " + objCarro.getPlaca() + 
				"\nMarca: " + objCarro.getMarca() +
				"\nModelo: " + objCarro.getModelo() + 
				"\nAno de fabricação: " + objCarro.getAno() + 
				"\nValor: " + objCarro.getValor() + 
				"\nVolante: " + objCarro.getVolante() + 
				"\n\n--DADOS DA MOTO--" +
				"\nPlaca: " + objMoto.getPlaca() + 
				"\nMarca: " + objMoto.getMarca() +
				"\nModelo: " + objMoto.getModelo() + 
				"\nAno de fabricação: " + objMoto.getAno() + 
				"\nValor: " + objMoto.getValor() + 
				"\nGuidão: " + objMoto.getMarcaGuidao());*/
				
				System.out.println(objCarro +
						"\n\n" +
						objMoto);

	}

}
