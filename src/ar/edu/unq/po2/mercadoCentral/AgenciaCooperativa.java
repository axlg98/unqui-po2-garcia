package ar.edu.unq.po2.mercadoCentral;

public class AgenciaCooperativa implements Agencia{
	
	@Override
	public void registrarPago(Factura factura) {
		System.out.print("Costo: " + factura.getPrecioDeLaFactura());
	}
}
