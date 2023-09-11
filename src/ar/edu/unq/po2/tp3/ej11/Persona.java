package ar.edu.unq.po2.tp3.ej11;

public class Persona {
	public String nombre;
	public String apellido;
	public int edad;
	
	public Persona(String n, String a, int e) {
		this.nombre = n;
		this.apellido = a;
		this.edad = e;
	}
	
	public int getEdad() {
		return edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
}
