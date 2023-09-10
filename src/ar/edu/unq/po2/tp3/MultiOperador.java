package ar.edu.unq.po2.tp3;

public class MultiOperador {
	
	public Integer sumar(int[] numeros) {
		int contador = 0;
		for(int i : numeros) {
			contador +=i;
		}
	return contador;
	}
	
	public Integer restar(int[] numeros) {
		int contador = 0;
		for(int i : numeros) {
			contador -= i;
		}
	return contador;	
	}
	
	public Integer mulciplicar(int[] numeros) {
		int contador = 1;
		for(int i : numeros) {
			contador = contador * i;
		}
	return contador;
	}
	
}
