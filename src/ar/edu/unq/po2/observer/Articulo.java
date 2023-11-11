package ar.edu.unq.po2.observer;

import java.util.List;
import java.util.ArrayList;
import java.util.Observable;

public class Articulo extends Observable{
	private String titulo;
	private List<Investigador> investigadores;
	private Filiacion filiacion;
	private String tipoDeArticulo;
	private String lugar;
	private String palabraClave;
	
	public Articulo() {
		this.titulo = "";
		this.investigadores = new ArrayList<Investigador>();
		this.filiacion = null;
		this.tipoDeArticulo = "";
		this.lugar = "";
		this.palabraClave = "";
		this.reset();
	}
	
	public void reset() {
		
	}
	
	//SET Y GET
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
		this.notificar();
	}
	
	public List<Investigador> getAutores() {
		return investigadores;
	}
	public void setAutores(List<Investigador> autores) {
		this.investigadores = autores;
	}
	public Filiacion getFiliacion() {
		return filiacion;
	}
	public void setFiliacion(Filiacion filiacion) {
		this.filiacion = filiacion;
	}
	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}
	public void setTipoDeArticulo(String tipoDeArticulo) {
		this.tipoDeArticulo = tipoDeArticulo;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getPalabraClave() {
		return palabraClave;
	}
	public void setPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}
	
	public void notificar() {
		this.setChanged();
		this.notifyObservers();
	}
	
}
