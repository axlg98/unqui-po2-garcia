package ar.edu.unq.po2.tp3.ej11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	public EquipoDeTrabajo equipo1;
	private Persona axel;
	private Persona daniel;
	private Persona gabriela;
	private Persona cosme;
	private Persona ayelen;
	
	@BeforeEach
	void setUp() {
		axel = new Persona("Axel", "García",25);
		daniel = new Persona("Daniel", "Saia",55);
		gabriela = new Persona("Gabriela", "Sarrocco",80);
		cosme = new Persona("Cosme", "Fulanito",30);
		ayelen = new Persona("Ayelen", "Billordo",26);
		equipo1 = new EquipoDeTrabajo("equipo1");
	}
	@Test
	void promedioDeEdadTest() {
		equipo1.agregarPersona(axel);
		equipo1.agregarPersona(daniel);
		equipo1.agregarPersona(gabriela);
		equipo1.agregarPersona(cosme);
		equipo1.agregarPersona(ayelen);
		assertEquals(equipo1.promedioEdadEquipo(), 43);
	}

}
