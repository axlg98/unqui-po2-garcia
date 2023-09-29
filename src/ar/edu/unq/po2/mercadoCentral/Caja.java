package ar.edu.unq.po2.mercadoCentral;

import java.util.List;
public class Caja {
	private List<Producto> productosDelCliente;
	//private Stock stock;
	
	public Caja(List<Producto> productos,Stock stock) {
		this.setProductosDelCliente(productos);
		for(Producto prod : productosDelCliente) {
			stock.decrementarStock(prod);
		}
	}

	public void setProductosDelCliente(List<Producto> prods) {
		this.productosDelCliente = prods;
	}

	public List<Producto> getProductosDelCliente() {
		return productosDelCliente;
	}
	
	public void agregarProdAlCliente(Producto p) {
		productosDelCliente.add(p);
	}
	
	public double montoTotalAPagar() {
		double precioTotal = 0;
		for(Producto prod : productosDelCliente) {
			precioTotal += prod.getPrecio();
			//stock.decrementarStock(prod);
		}
	return precioTotal;
	}
	
}
