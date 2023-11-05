package ar.edu.unq.po2.composite;

import java.time.LocalDate;
import java.util.List;

public class Directorio implements FyleSystem{
	private String nombre;
	private LocalDate fechaCreada;
	private List<FyleSystem> contenido;
	
	public Directorio(String nombre, LocalDate fecha,List<FyleSystem> contenidos) {
		this.setNombre(nombre);
		this.setFechaCreada(fecha);
		this.setContenido(contenidos);
	}
	
	@Override
	public int totalSize() {
		return contenido.stream().mapToInt(c ->c.totalSize()).sum();
	}
	
	@Override
	public void printStructure() {
		contenido.stream().forEach(c->c.printStructure());
	}
	
	@Override
	public FyleSystem lastModified() {
		return null;
	}
	
	@Override
	public FyleSystem oldestElement() {
		return null;
	}
	
	//GET Y SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaCreada() {
		return fechaCreada;
	}
	public void setFechaCreada(LocalDate fechaCreada) {
		this.fechaCreada = fechaCreada;
	}
	public List<FyleSystem> getContenido() {
		return contenido;
	}
	public void setContenido(List<FyleSystem> contenido) {
		this.contenido = contenido;
	}
	
}
