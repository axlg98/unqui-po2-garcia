package ar.edu.unq.po2.tp3.ej11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	private Persona axel;
	
	@BeforeEach
	void setUp() {
		axel = new Persona("Axel", "García",25);
	}
	@Test
	void datosDeLaPersonaTest() {
		assertEquals(axel.getApellido(), "García");
		assertEquals(axel.getNombre(), "Axel");
		assertEquals(axel.getEdad(), 25);
	}

}
