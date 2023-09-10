package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	private Persona axel;
	private Persona fulano;
	
	@BeforeEach
	void setUp() {
		axel   = new Persona("Axel",LocalDate.of(1998,4,8));
		fulano = new Persona("Fulano",LocalDate.of(2010, 10, 22)); 
	}
	
	@Test
	void edadDeLaPersona() {
		assertEquals(axel.edad(), 25);
	}
	@Test
	void edadDeLaPersonaFulano() {
		assertEquals(fulano.edad(), 12);
	}
	@Test
	void esMenorEdadQue() {
		assertTrue(fulano.menorQue(axel));
	}
}
