package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	
	private Point point;
	private Point point43;
	
	@BeforeEach
	void setUp() {
		point = new Point();
		point43 = new Point(4,3);
	}

	@Test
	void nuevaCoordenada() {
		assertEquals(point.getX(),0);
		assertEquals(point.getY(),0);
	}
	@Test
	void moverPosTest() {
		point.moverAPosicion(3, 8);
		assertEquals(point.getX(),3);
		assertEquals(point.getY(),8);
	}
	@Test
	void sumarCoordTest() {
		point.sumarPuntos(point43);
		assertEquals(point.getX(),4);
		assertEquals(point.getY(),3);
	}

}
