package ar.edu.unq.po2.templateMethod;

public abstract class Empleado {
	private double sueldoBasico;
	private double sueldoTotal;

	//TEMPLATE METHOD.
	public final void pagoDeSueldo() {
		double sueldo =  this.getSueldoBasico() + this.montoTotal();
		double descuento = this.descuentoDeSueldo(sueldo);
		this.setSueldoTotal(sueldo - descuento);
	}
	
	public double descuentoDeSueldo(double sueldo) {
		return sueldo * 13 / 100;
	}
	
	protected abstract double montoTotal();	
	
	//GET Y SET
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	public double getSueldoTotal() {
		return sueldoTotal;
	}

	public void setSueldoTotal(double sueldoTotal) {
		this.sueldoTotal = sueldoTotal;
	}
	
}
