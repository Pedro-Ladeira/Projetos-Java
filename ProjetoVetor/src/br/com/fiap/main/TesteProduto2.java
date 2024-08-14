package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProduto2 {

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

	// Preparar quantidade máxima de posições	
	Produto[] vetorProduto = new Produto[3]; // [0(indice)] [] [] 
	
	//o indice controla a entrada de produto
	int indice = 0;
	
	// Começa com o valor de 0 para iniciar o while
	int resultado = 0;
	
	
	// enquanto o resultado for igual a 0 continua a repetição
	while (resultado == 0) {
		
		vetorProduto[indice] = new Produto();
		vetorProduto[indice].setMarca(texto("Informe a marca"));
		vetorProduto[indice].setModelo(texto("Iforme o modelo"));
		vetorProduto[indice].setQuantidade(inteiro("Digite a quantidade"));
		vetorProduto[indice].setValor(real("Informe o valor"));
		
		indice ++; // Avança para o próximo vetor 
		
		resultado = JOptionPane.showConfirmDialog(null, "Adicionar mais algum produto no carrinho?", 
				"CARRINHO DE COMPRAS", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
		}
	
	//saída
	for(int contador = 0 ; contador < indice ; contador ++) {
		System.out.println(
				"\n\nMarca: " + vetorProduto[contador].getMarca()+
				"\nModelo: " + vetorProduto[contador].getModelo()+
				"\nQuantidade: " + vetorProduto[contador].getQuantidade()+
				"\nValor: " + vetorProduto[contador].getValor()
				);
	}
	
	}

}
