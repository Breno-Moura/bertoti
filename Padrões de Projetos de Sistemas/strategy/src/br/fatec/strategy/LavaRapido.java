package br.fatec.strategy;

public class LavaRapido implements Agendamento{

	public void agendar(String marca, Float preco) {
		System.out.println("Lava R�pido - " + marca + "\nPre�o: R$" + preco);	
	}
	
}
