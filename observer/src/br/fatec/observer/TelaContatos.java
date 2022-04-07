package br.fatec.observer;

public class TelaContatos implements Observer{
	
	public void enviarNotificacao(String notificacao){
		
		display(notificacao);
		
	}
	
	public void display(String notificacao){
		
		System.out.println("Tela do Contato");
		System.out.println("Recebendo notificacao: " + notificacao);
	}

}
