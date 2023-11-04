package ar.edu.unq.po2.templateMethod;

public class EmpleadoTemporareo extends Empleado {
	private int cantHora;
	public boolean tieneHijos;
	public boolean estaCasado;
	
	public EmpleadoTemporareo(boolean tieneHijo, boolean esCasado) {
		this.setTieneHijos(tieneHijo);
		this.setEstaCasado(esCasado);
	}
	
	@Override
	protected double montoTotal() {
		return 5 * this.getCantHora() + this.poseeHijos();
	}
	
	public double poseeHijos() {
		if(this.isTieneHijos() || this.isEstaCasado()) {
			return 100;
		}else {
			return 0;
		}
	}
	
	//SET Y GET
	
	public boolean isTieneHijos() {
		return tieneHijos;
	}
	
	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}
	
	public boolean isEstaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}
	
	public int getCantHora() {
		return cantHora;
	}
	
	public void setCantHora(int cantHora) {
		this.cantHora = cantHora;
	}
}
