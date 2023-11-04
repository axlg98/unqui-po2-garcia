package ar.edu.unq.po2.bancoYPrestamo;

import java.util.List;

public class Banco {
	
	private List<Cliente> clientes;
	private double saldo;
	private List<Credito> creditos;
	
	public Banco(double s, List<Cliente> cs) {
		this.setSaldo(s);
		this.setClientes(cs);
	}
	
	public void agregarCliente(Cliente c) {
		clientes.add(c);
	}
	
	public double darUnCredito(Credito cred) {
		this.agregarCredito(cred);
		if(cred.evaluarSolicitud() && this.getSaldo() > cred.getMontoSolicitado()) {
			return cred.getMontoSolicitado();	
		}else {
			return 0;
		}
	}
	
	public void aumentarElSaldo(int plazoDelCliente, double cantidad) {
		int plazo = plazoDelCliente;
		while(plazo > 0) {
			this.setSaldo(cantidad);
			plazo -=1;
		}
	}
	
	public void agregarCredito(Credito cred) {
		creditos.add(cred);
	}
	
	public double montoTotalDeLosCreditos() {
		double montoTotal = 0;
		for(Credito c : creditos) {
			montoTotal += c.getMontoSolicitado();
		}
		return montoTotal;
	}
	
	//GET Y SET
	
	public List<Credito> getCreditos() {
		return creditos;
	}

	public void setCreditos(List<Credito> creditos) {
		this.creditos = creditos;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
