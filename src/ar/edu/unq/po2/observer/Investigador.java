package ar.edu.unq.po2.observer;

public class Investigador {
	private boolean recibirNotificacion;
	
	public Investigador(boolean recibirNot) {
		this.setRecibirNotificacion(recibirNot);
	}
	
	//SET Y GET
	
	public boolean isRecibirNotificacion() {
		return recibirNotificacion;
	}
	
	public void setRecibirNotificacion(boolean recibir) {
		this.recibirNotificacion = recibir;
	}
}
