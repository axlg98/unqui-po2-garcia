package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultiploTest {
	private Multiplo mult;
	
	@BeforeEach
	public void setUp()  {
		mult = new Multiplo(3,9);
	}
	
	@Test
	public void multiploTest() {
		assertEquals(mult.multiploDe(),999);
	}

}
