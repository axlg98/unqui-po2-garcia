package ar.edu.unq.po2.mercadoCentral;

public class Factura {
	private double precioDeLaFactura;
	
	public Factura(double pdlFac) {
		this.setPrecioDeLaFactura(pdlFac);
	}

	//GETTER Y SETTER
	public double getPrecioDeLaFactura() {
		return precioDeLaFactura;
	}

	public void setPrecioDeLaFactura(double precioDeLaFactura) {
		this.precioDeLaFactura = precioDeLaFactura;
	}
}
