package br.fatec.observer;

public class TelaLoja implements Observer{
	
	public void enviarNotificacao(String notificacao){
		
		display(notificacao);
		
	}
	
	public void display(String notificacao){
		
		System.out.println("Tela da Loja");
		System.out.println("Enviando notificacao: " + notificacao);
	}

}
