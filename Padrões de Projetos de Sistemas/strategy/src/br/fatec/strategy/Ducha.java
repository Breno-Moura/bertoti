package br.fatec.strategy;

public class Ducha implements Agendamento{
	
	public void agendar(String marca, Float preco) {
		System.out.println("Ducha - " + marca + "\nPreço: R$" + preco);	
	}
	
}
