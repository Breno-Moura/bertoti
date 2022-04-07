package br.fatec.observer;
import java.util.ArrayList;


public class Notificacoes implements Subject{
	
	private ArrayList observers;
	private Contato c;
	
	public Notificacoes(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(String notificacao){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.enviarNotificacao(notificacao);
		}
	}
	
	public String enviarNotificacao(Contato c, String n){
		notifyObservers(c.email);
		return n;
	}

}
