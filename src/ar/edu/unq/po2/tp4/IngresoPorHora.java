package ar.edu.unq.po2.tp4;

public class IngresoPorHora extends Ingreso {
	private int cantHorasExtras;

	public int getCantHorasExtras() {
		return cantHorasExtras;
	}

	public void setCantHorasExtras(int cantHorasExtras) {
		this.cantHorasExtras = cantHorasExtras;
	}
	
	public double cantidadDeImpuesto(Trabajador t) {
		return 0;
	}
	
}
