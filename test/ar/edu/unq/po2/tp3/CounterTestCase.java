package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;
/**
* Crea un escenario de test básico, que consiste en un contador
* con 10 enteros
*
* @throws Exception
*/
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
	counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);	
		counter.addNumber(1);
		counter.addNumber(4);
	}
	/**
	 * Verifica la cantidad de pares
	 */
	@Test
	public void testContarPares() {
		assertEquals(counter.contarPares(),1);
	}
	@Test
	public void testContarImpares() {
		assertEquals(counter.contarImpares(),9);
	}
	@Test
	public void testContarMult() {
		assertEquals(counter.contarMultiplos(3),2);
	}
}
