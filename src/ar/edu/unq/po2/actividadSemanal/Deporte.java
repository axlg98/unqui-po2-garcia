package ar.edu.unq.po2.actividadSemanal;

public enum Deporte {
	RUNNING(1),FUTBOL(2),BASKET(2),TENNIS(3),JABALINA(4);
	
	private int complejidad;
	
	Deporte(int c){
		this.setComplejidad(c);
	}
	
	public void setComplejidad(int complejidad) {
		this.complejidad = complejidad;
	}
	
	public int getComplejidad() {
		return complejidad;
	}
}
