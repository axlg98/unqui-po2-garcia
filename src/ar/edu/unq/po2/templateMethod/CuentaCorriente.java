package ar.edu.unq.po2.templateMethod;

public class CuentaCorriente extends CuentaBancaria {
	 private int descubierto;
	 public CuentaCorriente(String titular, int descubierto){
		 super(titular);
		 this.descubierto=descubierto;
	 }
	 public int getDescubierto(){
		 return this.descubierto;
	 }
	 
	 @Override
	 protected int calcularComision(int monto) {
		 return this.getDescubierto();
	 }
}
