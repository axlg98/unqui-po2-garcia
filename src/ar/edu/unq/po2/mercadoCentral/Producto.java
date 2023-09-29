package ar.edu.unq.po2.mercadoCentral;

public class Producto implements Facturable{
	private double precio;
	private Factura factura;
	private int stock = 0;
	
	public Producto(double pre) {
		this.setPrecio(pre);	
	}
	
	public double precioDelProducto() {
		return this.getPrecio();
	}

	@Override
	public double montoAPagar() {
		return precio;
	}
	
	public void registrar() {
		this.decrementarStock();
	}
	
	public void decrementarStock() {
		if(this.getStock() > 0) {
			this.setStock(this.getStock()-1);
		}
	}
	
	public void aumentarStock(int unaCantidad) {
		this.setStock(this.getStock() + unaCantidad);
	}
	
	//GETTER Y SETTER
	
	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
