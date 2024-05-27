package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Agendamento;
import br.com.fiap.beans.Carro;
import br.com.fiap.beans.Cliente;
import br.com.fiap.beans.Contato;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Moto;
import br.com.fiap.beans.Oficinas;
import br.com.fiap.beans.Pagamento;
import br.com.fiap.beans.Problema;
import br.com.fiap.beans.Usuario;

public class Execucao {
	
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
		
		//int codigo, String nome, String dataNascimento, String cpf
		Cliente objCliente = new Cliente(
				texto("Nome do cliente"),
				texto("Data de nascimento"),
				texto("CPF")
				);
		
		//int codigo, String login, String senha
		Usuario objUsuario = new Usuario(
				inteiro("Código de Usuário"),
				texto("Login"),
				texto("Senha")
				);
		
		//String numTel, String email
		Contato objContatoCliente = new Contato(
				texto("Número de telefone"),
				texto("Email")
				);
		
		objCliente.setContato(objContatoCliente);
		
		//String logradouro, int numero, String complemento, String cep, String bairro, String cidade,
		//String estado
		Endereco objEnderecoCliente = new Endereco(
				texto("Logradouro"),
				inteiro("Número de residência"),
				texto("Complemento"),
				texto("CEP"),
				texto("Bairro"),
				texto("Cidade"),
				texto("Estado")
				);
		
		objCliente.setEndereco(objEnderecoCliente);
		
		//String tipo, String placa, String marca, String modelo, int ano, String partida, int qtdCilindros
		Moto objMoto = new Moto(
				texto("Tipo da moto"),
				texto("Placa da moto"),
				texto("Marca da moto"),
				texto("Modelo da moto"),
				inteiro("Ano de fabricação da moto"),
				texto("Tipo de partida da moto (Pedal ou Elétrica)"),
				inteiro("Quantidade de cilindros da moto")
				);
		
		Problema objProblemaMoto = new Problema(
				texto("Descrição sucinta do problema realcionado à moto"),
				texto("Sintomas percebidos no veículo")
				);
		
		//String tipo, String placa, String marca, String modelo, int ano, String carroceria, String transmissao,
		//String tracao
		Carro objCarro = new Carro(
				texto("Tipo do carro"),
				texto("Placa do carro"),
				texto("Marca do carro"),
				texto("Modelo do carro"),
				inteiro("Ano de fabricação do carro"),
				texto("Carroceria do carro (Hatch, Sedan, SUV...)"),
				texto("Tipo de transmissão do carro (Automatico, Manual...)"),
				texto("Tipo de tração do carro")
				);
		
		Problema objProblemaCarro = new Problema(
				texto("Descrição sucinta do problema relacionado ao carro"),
				texto("Sintomas percebidos no veículo")
				);
		
		Agendamento objAgendaCliente = new Agendamento(
				texto("Data do agendamento"),
				real("Horário de preferência")
				);
		
		objCliente.setAgenda(objAgendaCliente);
		
		//String tipo, int numCartao, String bandeira, String nome, double valor
		Pagamento objPagamento = new Pagamento(
				texto("Tipo de pagamento"),
				inteiro("Número do cartão"),
				texto("Bandeira do cartão"),
				texto("Nome cadastrado no cartão"),
				real("Valor do serviço"),
				real("Saldo da sua conta")
				);

		//String nome, String especialidade, String cnpj
		Oficinas objOficina = new Oficinas(
				texto("Nome da oficina em que o(s) veículo(s) está(ão) cadastrado(s)"),
				texto("Escpecialidade de serviços da oficina"),
				texto("CNPJ")
				);
		
		//String logradouro, int numero, String complemento, String cep, String bairro, String cidade,
		//String estado
		Endereco objEnderecoOficina = new Endereco(
				texto("Logradouro da Oficina"),
				inteiro("Número do estabelecimento da oficina"),
				texto("Complemento"),
				texto("CEP"),
				texto("Bairro"),
				texto("Cidade"),
				texto("Estado")
				);
		
		objOficina.setEndereco(objEnderecoOficina);
		
		Contato objContatoOficina = new Contato(
				texto("Número para contato da oficina"),
				texto("Email para contato da oficina")
				);
		 
		objOficina.setContato(objContatoOficina);
		
		Agendamento objAgendaOficina = new Agendamento(
				texto("Data disponível para agendamento"),
				real("Horário disponível")
				);
		
		objOficina.setAgenda(objAgendaOficina);
		
		System.out.println(objCliente.darBoasVindas() + objCliente + objUsuario 
				+ objContatoCliente + objEnderecoCliente + objMoto.identificar() 
				+ objMoto + objProblemaMoto 
				+ objCarro.identificar() + objCarro 
				+ objProblemaCarro + objAgendaCliente + objPagamento + objPagamento.verificarPagamento()
				+ objOficina.identificar() + objOficina + objEnderecoOficina 
				+ objContatoOficina + objAgendaOficina);
	}

}
