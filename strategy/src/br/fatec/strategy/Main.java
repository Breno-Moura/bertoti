package br.fatec.strategy;

public class Main {

	public static void main(String[] args) {
		
		Carro onix = new Carro();
		onix.setNome("Onix 2022");
		onix.setPreco(15.49f);
		onix.setAgendamento(new Ducha());
		onix.agendar(onix.getMarca(), onix.getPreco());
		
		System.out.println("------------------");
		
		onix.setPreco(49.99f);
		onix.setAgendamento(new LavaRapido());
		onix.agendar(onix.getMarca(), onix.getPreco());
		
	}
	
}
