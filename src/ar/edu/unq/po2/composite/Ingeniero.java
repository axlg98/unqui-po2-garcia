package ar.edu.unq.po2.composite;

import java.util.List;

import ar.edu.unq.po2.tp3.Point;

public class Ingeniero {
	private Integer cantidadDeLaja;
	private Point ubicacion;
	private List<CeldaCamino> caminos;
	
	public void caminarHacia(Point punto) {
		this.construirCaminoDeLaja();
		this.setUbicacion(punto);
	}
	
	public void construirCaminoDeLaja() {
		caminos.forEach(camino -> this.dejarLajaSiCorresponde(camino));
	}
	
	public void dejarLajaSiCorresponde(CeldaCamino camino) {
		if(!camino.isHayLaja()) {
			this.setCantidadDeLaja(this.getCantidadDeLaja()-1);
		}
	}

	//GET Y SET
	
	public Integer getCantidadDeLaja() {
		return cantidadDeLaja;
	}
	public void setCantidadDeLaja(Integer cantidadDeLaja) {
		this.cantidadDeLaja = cantidadDeLaja;
	}
	public Point getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Point ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<CeldaCamino> getCaminos() {
		return caminos;
	}
	public void setCaminos(List<CeldaCamino> caminos) {
		this.caminos = caminos;
	}
}
