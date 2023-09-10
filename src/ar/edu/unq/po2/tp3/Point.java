package ar.edu.unq.po2.tp3;

public class Point {
	private Integer x = 0;
	private Integer y = 0;
	
	public Point() {};
	
	public Point(Integer a, Integer b) {
		this.setX(a);
		this.setY(b);
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}
	
	public void moverAPosicion(Integer n, Integer k) {
		this.setX(n);
		this.setY(k);
	}
	
	public void sumarPuntos(Point punto) {
		this.x += punto.getX();
		this.y += punto.getY();
	}
	
}
