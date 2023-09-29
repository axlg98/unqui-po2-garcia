package ar.edu.unq.po2.tp4;

public class Ingreso {
	private String mesDePercepcion;
	private double montoPercibido;
	private String concepto;
	
	public String getMesDePercepcion() {
		return mesDePercepcion;
	}
	public Double getMontoPercibido() {
		return montoPercibido;
	}
	public String getConcepto() {
		return concepto;
	}
	
	public double montoImponible() {
		return this.getMontoPercibido();
	}
	
	public double cantidadDeImpuesto(Trabajador t) {
		return t.getMontoImponible();
	}
	
}
