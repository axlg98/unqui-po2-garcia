package ar.edu.unq.po2.poker;

public class Trio{
	private Carta carta;
	
	public boolean esDelMismoColor(String color) {
		return carta.getNroYPalo().equals(color);
	}
}
