package br.fatec.observer;

public class Main {

	public static void main(String[] args) {
		
		Notificacoes notificacoes = new Notificacoes();
		Contato contato = new Contato("Julia", "julia.silva@gmail.com");
		
		TelaLoja telaLoja = new TelaLoja();
		TelaContatos telaContatos = new TelaContatos();
		notificacoes.registerObserver(telaLoja);
		notificacoes.registerObserver(telaContatos);	
		telaLoja.enviarNotificacao("Teste " + contato.email);
		telaContatos.enviarNotificacao("Teste");
		
	}
}
