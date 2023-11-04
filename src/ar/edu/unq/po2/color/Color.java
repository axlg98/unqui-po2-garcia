package ar.edu.unq.po2.color;

public enum Color {
	ROJO(10,"excelente"),GRIS(7,"normal"),AMARILLO(4,"con lo justo"),MIEL(0,"nulo");
	
	private int nivelRiesgo;
	private String descripcion;
	
	 Color(int nivel, String desc) {
		this.nivelRiesgo = nivel;
		this.descripcion = desc;
	}
	 
	 public Color proximoColor(Color unColor) {
		 Color[] color = Color.values();
		 int proximo = unColor.ordinal() + 1;
 		 return Color.values()[proximo % color.length - 1];
	 }

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNivelRiesgo() {
		return nivelRiesgo;
	}

	public void setNivelRiesgo(int nivelRiesgo) {
		this.nivelRiesgo = nivelRiesgo;
	}
	
}
