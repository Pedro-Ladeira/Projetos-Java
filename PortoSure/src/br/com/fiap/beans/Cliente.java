package br.com.fiap.beans;

public class Cliente {

	private String nome;
	private String dataNascimento;
	private String cpf;
	private Usuario usuario;
	private Contato contato;
	private Endereco endereco;
	private Veiculo veiculo;
	private Agendamento agenda;
	private Pagamento pagamento;

	public Cliente() {
		super();
	}

	public Cliente(String nome, String dataNascimento, String cpf) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Agendamento getAgenda() {
		return agenda;
	}

	public void setAgenda(Agendamento agenda) {
		this.agenda = agenda;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public String toString() {
		return "\nNome = " + getNome() + "\nData de Nascimento = " + getDataNascimento() + "\nCPF = " + getCpf();
	}

    
    // Método para dar boas-vindas ao cliente
    public String darBoasVindas() {
        return "Bem Vindo " + getNome() + ", aqui estão os seus dados:";
    }
}
