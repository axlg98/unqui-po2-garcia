package ar.edu.unq.po2.mercadoCentral;

public class ProductoCooperativa extends Producto {
	
	public ProductoCooperativa(double p) {
		super(p);
	}
	
	@Override
	public double precioDelProducto() {
		return super.getPrecio() * 0.1;
	}
}
