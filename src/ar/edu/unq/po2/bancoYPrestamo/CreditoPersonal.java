package ar.edu.unq.po2.bancoYPrestamo;

public class CreditoPersonal extends Credito{
	
	@Override
	public boolean evaluarSolicitud() {
		return this.EsMayorElSueldoAnual() && this.elMontoDeLaCuotaEsMenorAlIngresoMensual();
	}
	
	public boolean EsMayorElSueldoAnual() {
		return super.getCliente().sueldoAnual() >= 15000;
	}
	
	public boolean elMontoDeLaCuotaEsMenorAlIngresoMensual() {
		return super.obtenerMontoDeLaCuota() < super.getCliente().getSueldoMensual() *0.70;
	}
}
