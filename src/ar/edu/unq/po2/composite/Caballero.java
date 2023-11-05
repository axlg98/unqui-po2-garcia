package ar.edu.unq.po2.composite;

import ar.edu.unq.po2.tp3.Point;

public class Caballero extends Ejercito{
	private Point ubicacion;
	
	public Caballero(Point punto) {
		this.setUbicacion(punto);
	}
	
	public void caminarHacia(Point punto) {
		this.setUbicacion(new Point(punto.getX()+1,punto.getY()+1));
	}
	
	//GET Y SET
	
	public Point getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Point ubicacion) {
		this.ubicacion = ubicacion;
	}
}
