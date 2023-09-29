package ar.edu.unq.po2.tp4;

import java.util.List;

public class Trabajador extends Ingreso{
	private double totalPercibido;
	private double montoImponible;
	private double impuestoAPagar;
	private List<Ingreso>listaDeIngresos;
	
	public double getTotalPercibido() {
		return totalPercibido;
	}
	public double getMontoImponible() {
		return montoImponible;
	}
	public double getImpuestoAPagar() {
		return impuestoAPagar;
	}
	
	public Double montoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
	public void agregarIngreso(Ingreso ing) {
		listaDeIngresos.add(ing);
	}
	
	public double cantImpuestoAlTrabajador() {
		int cantidadImp = 0;
		for(Ingreso ing : listaDeIngresos) {
			cantidadImp += ing.cantidadDeImpuesto(this);
		}
	return cantidadImp;
	}
	
}
