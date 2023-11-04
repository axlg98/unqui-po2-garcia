package ar.edu.unq.po2.templateMethod;

public class CajaDeAhorro extends CuentaBancaria {
	 private int limite;
	 
	 public CajaDeAhorro(String titular, int limite){
		 super(titular);
		 this.limite=limite;
	 }
	 
	 public int getLimite(){
		 return this.limite;
	 }
	 
	 @Override
	 protected int calcularComision(int monto) {
		 return this.getLimite();
	 }
}
