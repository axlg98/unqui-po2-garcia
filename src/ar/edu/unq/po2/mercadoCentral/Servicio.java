package ar.edu.unq.po2.mercadoCentral;

public class Servicio implements Facturable{
	private double costoPorUnidad;
	private Agencia unaAgencia;
	private Factura factura;

	private int cantidadDeUnidadesConsumidas;
	
	public Servicio(double costo, int cantidad) {
		this.costoPorUnidad = costo;
		this.cantidadDeUnidadesConsumidas = cantidad;
	}
	@Override
	public double montoAPagar() {
		return this.getCostoPorUnidad() * this.getCantidadDeUnidadesConsumidas();
	}
	
	public void registrar() {
		unaAgencia = new AgenciaCooperativa();
		factura = new Factura(this.montoAPagar());
		unaAgencia.registrarPago(factura);
	}
	
	//GETTER
	
	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public int getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}
}
