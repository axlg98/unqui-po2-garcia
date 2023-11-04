package ar.edu.unq.po2.templateMethod;

public class EmpleadoPasante extends Empleado {
	private int cantHoraPorMes;
	
	public int getCantHoraPorMes() {
		return cantHoraPorMes;
	}

	public void setCantHoraPorMes(int cantHoraPorMes) {
		this.cantHoraPorMes = cantHoraPorMes;
	}

	public EmpleadoPasante() {
		
	}
	
	@Override
	protected double montoTotal() {
		return 40 * this.getCantHoraPorMes() * 24;
	}
	
}
