package ar.edu.unq.po2.bancoYPrestamo;

public class CreditoHipotecario extends Credito{
	private Propiedad propInmobiliaria;
	
	@Override
	public boolean evaluarSolicitud() {
		return this.esMenorAlIngresoMensual() && this.esMayorAlValorFiscal() && this.EsMenorDeEdadRequerida();
	}
	
	public boolean esMenorAlIngresoMensual() {
		return super.obtenerMontoDeLaCuota() < super.getCliente().getSueldoMensual() * 0.50;
	}
	
	public boolean esMayorAlValorFiscal() {
		return super.getMontoSolicitado() < this.getPropInmobiliaria().getValorFiscal() * 0.70;
	}
	
	public boolean EsMenorDeEdadRequerida() {
		return super.getCliente().getEdad() < 65;	
	}
	
	//GET Y SET
	public Propiedad getPropInmobiliaria() {
		return propInmobiliaria;
	}

	public void setPropInmobiliaria(Propiedad propInmobiliaria) {
		this.propInmobiliaria = propInmobiliaria;
	}
	
}
