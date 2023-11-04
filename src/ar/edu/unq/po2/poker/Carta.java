package ar.edu.unq.po2.poker;

public class Carta {
	private String nroYPalo;
	
	public Carta(String nroYPalo) {
		this.setNroYPalo(nroYPalo);
	}

	//GET Y SET

	public String getNroYPalo() {
		return nroYPalo;
	}

	public void setNroYPalo(String nroYPalo) {
		this.nroYPalo = nroYPalo;
	}


}
