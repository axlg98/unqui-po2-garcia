package ar.edu.unq.po2.mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private Producto arroz;
	private Producto pan;
	private Stock stock;
	private Caja caja1;
	ArrayList<Producto> pods = new ArrayList<Producto>();
	 
	
	@BeforeEach
	public void setUp() throws Exception {
		arroz = new Producto(55d);
		pan = new Producto(21.5);
		stock = new Stock();
		stock.agregarProducto(pan);
		stock.agregarProducto(arroz);
		pods.add(arroz);
		pods.add(pan);
		caja1 = new Caja(pods,stock);
		
	}
	
	@Test
	void cajaTest() {
		assertEquals(caja1.montoTotalAPagar(),76.5);
	}
	
	@Test
	void cantidadDeProductosDelCliente() {
		assertEquals(caja1.getProductosDelCliente().size(),2);
	}
	
	@Test
	
	void listaDelStockDelMercado() {
		//assertEquals(caja1.montoTotalAPagar(),76.5);
		assertEquals(stock.getProductosDelStock().size(),0);
	}

}
