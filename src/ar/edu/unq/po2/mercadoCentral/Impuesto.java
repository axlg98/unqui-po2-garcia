package ar.edu.unq.po2.mercadoCentral;

public class Impuesto implements Facturable{
	private double tasaDeServicio;
	private Agencia unaAgencia;
	private Factura factura;
	
	public Impuesto(double tasa) {
		this.tasaDeServicio = tasa;
	}
	
	@Override
	public double montoAPagar() {
		return this.getTasaDeServicio();
	}
	
	public void registrar() {
		unaAgencia = new AgenciaCooperativa();
		factura = new Factura(this.montoAPagar());
		unaAgencia.registrarPago(factura);
	}

	//GET Y SET
	public double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}
}
