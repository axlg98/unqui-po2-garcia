package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
private ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
	
	public void addNumber(Integer x) {
		listaDeNumeros.add(x);
	}
	
	public int contarPares() {
		int cantidad = 0;
		for(Integer numero:this.getNumeros()) {
			if(numero % 2 == 0) {
				cantidad += 1;
			}
		}
		return cantidad;
	}
	
	private ArrayList<Integer> getNumeros(){
		return listaDeNumeros;
	}
	
	public int contarImpares() {
		int cantidadImp = 0;
		for(Integer numero:listaDeNumeros) {
			if(numero % 2 > 0) {
				cantidadImp += 1;
			}
		}
		return cantidadImp;
	}
	
	public int contarMultiplos(int x) {
		int cantiMult = 0;
		for(Integer numero:listaDeNumeros) {
			if(numero % x == 0) {
				cantiMult +=1;
			}
		}
		return cantiMult;
	}
}
