package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiOperadorTest {
	
	private MultiOperador multiOp;
	int[] numeros = {1,2,3,4,5};
	
	@BeforeEach
	void setUp() {
		multiOp = new MultiOperador();
	}
	
	@Test
	void sumarTest() {
		assertEquals(multiOp.sumar(numeros),15);
	}
	
	@Test
	void restarTest() {
		assertEquals(multiOp.restar(numeros),-15);
	}
	
	@Test
	void multiplicarTest() {
		assertEquals(multiOp.mulciplicar(numeros),120);
	}

}
