package ar.edu.unq.po2.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StockTest {
	private Stock stock;
	private Producto arroz;
	private Producto fideos;
	private Producto yerbaMate;
	private Producto cafe;
	
	@BeforeEach
	void setUp() {
		arroz = new Producto(28d);
		fideos = new Producto(35d);
		yerbaMate = new Producto(80d);
		cafe = new Producto(22d);
		stock = new Stock();
		stock.agregarProducto(arroz);
		stock.agregarProducto(cafe);
		stock.agregarProducto(fideos);
		stock.agregarProducto(yerbaMate);
	}
	
	@Test
	void cantidadDeStock() {
		assertEquals(stock.getProductosDelStock().size(),4);
	}
	
	@Test
	void decrementarStockConElArroz() {
		stock.decrementarStock(arroz);
		assertEquals(stock.getProductosDelStock().size(),3);
	}
	
	@Test
	void decrementarStockConElCafe() {
		stock.decrementarStock(cafe);
		assertEquals(stock.getProductosDelStock().size(),3);
	}
	
	@Test
	void decrementarStockConLosFideos() {
		stock.decrementarStock(fideos);
		assertEquals(stock.getProductosDelStock().size(),3);
	}
	
	@Test
	void decrementarStockConLaYerbaMate() {
		stock.decrementarStock(yerbaMate);
		assertEquals(stock.getProductosDelStock().size(),3);
	}
	
	@Test
	void sinProductosEnElStock() {
		stock.decrementarStock(arroz);
		stock.decrementarStock(cafe);
		stock.decrementarStock(fideos);
		stock.decrementarStock(yerbaMate);
		assertEquals(stock.getProductosDelStock().size(),0);
	}
	
	@Test
	void sinCafeYFideos() {
		stock.decrementarStock(cafe);
		stock.decrementarStock(fideos);
		assertEquals(stock.getProductosDelStock().size(),2);
	}
	
	@Test
	void sinYerbaMateYArroz() {
		stock.decrementarStock(yerbaMate);
		stock.decrementarStock(arroz);
		assertEquals(stock.getProductosDelStock().size(),2);
	}
}
