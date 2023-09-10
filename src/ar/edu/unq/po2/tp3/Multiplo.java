package ar.edu.unq.po2.tp3;

public class Multiplo {
	
	public int x;
	public int y;



	public Multiplo(int a, int b) {
		this.setX(a);
		this.setY(b);
	}
	
	
	public int getX() {
		return x;
	}


	public void setX(int a) {
		this.x = a;
	}


	public int getY() {
		return y;
	}


	public void setY(int b) {
		this.y = b;
	}


	public int multiploDe() {
		int valor;
		int result=0;
		valor = this.getX()*this.getY();
		while(valor < 1000) {
				result = valor;
				valor +=this.getX()*this.getY(); 
			
		}	
		if(valor >= 1000 || valor == 0) {
			valor = -1;
		}else {
			result = valor;
		}
	return result;
	}
	
}
