package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	public String nombre;
	public LocalDate fechaNacimiento;
	
	public Persona() {};
	
	public Persona(String nom, LocalDate fecha) {
		this.setNombre(nom);
		this.setFechaNacimiento(fecha);	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int edad() {
		LocalDate actualFecha = LocalDate.now();
		Period periodo = Period.between(this.getFechaNacimiento(), actualFecha);
		return periodo.getYears();
	}
	
	public boolean menorQue(Persona persona) {
		int miEdad = this.edad();
		int edadDeLaOtraPersona = persona.edad();
		return miEdad < edadDeLaOtraPersona;
	}
	
}
