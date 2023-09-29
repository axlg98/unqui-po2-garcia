package ar.edu.unq.po2.mercadoCentral;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
	private Producto leche;
	private Producto galletita;
	
	@BeforeEach
	void setUp() {
		leche = new Producto(480d);
		galletita = new Producto(150d);
	}
	
	@Test
	void stockDelProductoLeche() {
		leche.aumentarStock(15);
		assertEquals(leche.getStock(),15);
	}
	
	@Test
	void stockDelProductoGalletica() {
		galletita.aumentarStock(30);
		assertEquals(galletita.getStock(),30);
	}
	
	@Test
	void decrementarStockLeche() {
		leche.aumentarStock(15);
		leche.decrementarStock();
		assertEquals(leche.getStock(),14);
	}
	
	@Test
	void decrementarStockGalletita() {
		galletita.aumentarStock(30);
		galletita.decrementarStock();
		assertEquals(galletita.getStock(),29);
	}

}
