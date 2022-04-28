package br.fatec.strategy;

public class Carro {

	private String marca;
	private Agendamento agendamento;
	private Float preco;
	
	public void setAgendamento(Agendamento agendamento){
		this.agendamento = agendamento;
	}
	
	public void setNome(String marca){
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public void agendar(String marca, Float preco) {
		this.agendamento.agendar(marca, preco);
	}
	
}
