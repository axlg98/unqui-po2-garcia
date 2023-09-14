package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad {
	private String producto;
	private Double precio;
	private boolean esParteDelPrograma;
	
	public ProductoPrimeraNecesidad(String p,Double pre,boolean esParte) {
		this.producto = p;
		this.precio = pre;
		this.esParteDelPrograma = esParte;
	}
	
	
	public String getProducto() {
		return producto;
	}


	public boolean isEsParteDelPrograma() {
		return esParteDelPrograma;
	}


	public Double getPrecio() {
		return precio;
	}
	
	public Double precioProductoPrimeraNecesidad() {
		return this.getPrecio() * 0.9;
	}
	 
	
}
