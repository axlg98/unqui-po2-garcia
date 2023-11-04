package ar.edu.unq.po2.bancoYPrestamo;

public class Credito {
	private Cliente cliente;
	private double montoSolicitado;
	private int plazo;
	
	public Credito(Cliente c, double monto, int p) {
		this.setMontoSolicitado(monto);
		this.setPlazo(p);
		this.setCliente(c);
	}
	
	public Credito() {}
	
	public boolean evaluarSolicitud() {return true;}
	
	public double obtenerMontoDeLaCuota() {
		return cliente.getSueldoMensual() / this.getMontoSolicitado();
	}
	
	
	//GET Y SET

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
}
