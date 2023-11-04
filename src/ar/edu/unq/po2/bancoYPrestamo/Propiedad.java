package ar.edu.unq.po2.bancoYPrestamo;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	public Propiedad(String desc, String dir, double valor) {
		this.setDescripcion(desc);
		this.setDireccion(dir);
		this.setValorFiscal(valor);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
}
