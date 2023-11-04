package ar.edu.unq.po2.templateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class CuentaBancaria {
	 private String titular;
	 private int saldo;
	 private List<String> movimientos;
	 
	 public CuentaBancaria(String titular){
		 this.titular=titular;
		 this.saldo=0;
		 this.movimientos=new ArrayList<String>();
	 }
	 public String getTitular(){
		 return this.titular;
	 }
	 
	 public void agregarMovimientos(String movimiento){
		 this.movimientos.add(movimiento);
	 }
	 
	 protected abstract int calcularComision(int monto);
	 
	 public boolean validar(int monto, int comision) {
		 return this.getSaldo() > monto + comision;
	 }
	 
	 public void extraer(int monto) {
		 int comision = this.calcularComision(monto);
		 if(this.validar(monto,comision)){
			 this.setearSaldo(monto, comision);
			 this.agregarMovimientos("Extraccion");
		 }
	 }
	 
	 public void setearSaldo(int monto, int comision) {
		  this.setSaldo(getSaldo() - (monto + comision)); 
	 }
	 
	 //GET Y SET
	 
	 public int getSaldo(){
		 return this.saldo;
	 }
	 protected void setSaldo(int monto){
		 this.saldo=monto;
	 }
}
