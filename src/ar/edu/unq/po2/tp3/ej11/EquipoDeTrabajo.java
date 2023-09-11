package ar.edu.unq.po2.tp3.ej11;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	public String nombreEquipo;
	private List<Persona> personas;
	
	public EquipoDeTrabajo(String nomEquip) {
		this.nombreEquipo = nomEquip;
		this.personas = new ArrayList<>();
	}
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	
	public Integer sumaDeLasEdades() {
		int sumarEdades = 0;
		for(Persona persona : personas) {
			sumarEdades += persona.getEdad();
		}
	return sumarEdades;
	}
	
	public Integer cantidadDePersonas() {
		return personas.size();
	}
	
	public Integer promedioEdadEquipo() {
		return this.sumaDeLasEdades() / this.cantidadDePersonas();
	}
	
	public void agregarPersona (Persona persona) {
		personas.add(persona);
	}
}
