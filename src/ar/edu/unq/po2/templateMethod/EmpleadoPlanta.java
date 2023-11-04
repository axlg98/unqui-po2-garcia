package ar.edu.unq.po2.templateMethod;

public class EmpleadoPlanta extends Empleado{
	private int cantDeHijos;
	
	public EmpleadoPlanta(int cantidadHijos) {
		this.setCantDeHijos(cantidadHijos);
	}
	
	@Override
	protected double montoTotal() {
		return 150 * this.getCantDeHijos();
	}
	 
	//SET Y GET
	
	public int getCantDeHijos() {
		return cantDeHijos;
	}


	public void setCantDeHijos(int cantDeHijos) {
		this.cantDeHijos = cantDeHijos;
	}
	
}
