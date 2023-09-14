package ar.edu.unq.po2.tp4;

public class Producto {
	private String comida;
	private Double precio;
	private boolean esParteDelPrograma = false;
	
	public Producto (String c,Double p,boolean esParte) {
			this.comida = c;
			this.precio = p;
			this.esParteDelPrograma = esParte;
	}
	
	public Producto (String c,Double p) {
		this.comida = c;
		this.precio = p;
	}

	public Double getPrecio() {
		return precio;
	}
	
	public String getNombre() {
		return comida;
	}
	
	public boolean esPrecioCuidado() {
		return esParteDelPrograma;
	}
	
	public void aumentarPrecio(Double precioCuidado) {
		this.precio += precioCuidado;
	}
	
	 
}
