package ar.edu.unq.po2.composite;

import java.awt.Point;
import java.util.List;

public abstract class Ejercito {
	List<Ejercito> personajes;

	
	public void caminarHacia(Point punto) {
		personajes.forEach(personaje -> personaje.caminarHacia(punto));
	}
	
	//GET Y SET
	
	public List<Ejercito> getPersonajes() {
		return personajes;
	}

	public void setPersonajes(List<Ejercito> personajes) {
		this.personajes = personajes;
	}
	
}
