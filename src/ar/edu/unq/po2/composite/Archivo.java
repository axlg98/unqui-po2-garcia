package ar.edu.unq.po2.composite;

import java.time.LocalDate;

public class Archivo implements FyleSystem{
	private String nombre;
	private Integer cantidadDeEspacioDisco;
	private LocalDate fechaModificacion;
	
	public Archivo(String nombre,Integer espacio, LocalDate fecha) {
		this.setNombre(nombre);
		this.setCantidadDeEspacioDisco(espacio);
		this.setFechaModificacion(fecha);
	}
	
	@Override
	public int totalSize() {
		return this.getCantidadDeEspacioDisco();
	}
	
	@Override
	public void printStructure() {
		System.out.print(nombre);
	}
	
	@Override
	public FyleSystem lastModified() {
		return null;
	}
	
	@Override
	public FyleSystem oldestElement() {
		return null;
	}
	
	//SET Y GET
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidadDeEspacioDisco() {
		return cantidadDeEspacioDisco;
	}
	public void setCantidadDeEspacioDisco(Integer cantidadDeEspacioDisco) {
		this.cantidadDeEspacioDisco = cantidadDeEspacioDisco;
	}
	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(LocalDate fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
}
