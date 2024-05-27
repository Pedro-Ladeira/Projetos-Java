package br.com.fiap.beans;

public class Agendamento {

	private String data;
	private double hora;

	public Agendamento() {
		super();
	}

	public Agendamento(String data, double hora) {
		super();
		this.data = data;
		this.hora = hora;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getHora() {
		return hora;
	}

	public void setHora(double hora) {
		this.hora = hora;
	}

	public String toString() {
		return "\n\n--Agendamento--\nData = " + data + "\nHorário = " + hora;
	}

	
}
