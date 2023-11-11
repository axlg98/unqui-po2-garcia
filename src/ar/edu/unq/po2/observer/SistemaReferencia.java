package ar.edu.unq.po2.observer;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class SistemaReferencia implements Observer{
	private List<Articulo> articulos;
	private Investigador inv;
	
	@Override
	public void update(Observable o, Object arg) {
	}
	
	public void cargarArticulo() {
		
	}
	
	//ARREGLAR
	
	public void verificarNotificacion() {
		if(inv.isRecibirNotificacion()) {
			this.notificar("Usted se ha suscripto");
		}
	}
	
	public void notificar(String texto) {
		
	}
	
	
}
