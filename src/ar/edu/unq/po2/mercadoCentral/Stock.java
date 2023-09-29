package ar.edu.unq.po2.mercadoCentral;

import java.util.List;
import java.util.ArrayList;

public class Stock {
	private List<Producto> productosDelStock;

	
	public Stock() {
		productosDelStock = new ArrayList<Producto>();
	}

	public List<Producto> getProductosDelStock() {
		return productosDelStock;
	}
	
	public void agregarProducto(Producto p){
		productosDelStock.add(p);
	}

	//public void setProductosDelStock(List<Producto> productosDelStock) {
		//this.productosDelStock = productosDelStock;
	//}
	
	public void decrementarStock(Producto p) {
		productosDelStock.remove(p);
	}
	

	
}
