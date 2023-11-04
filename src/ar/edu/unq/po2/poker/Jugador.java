package ar.edu.unq.po2.poker;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	private String nombre;
	private List<Carta> cartasJugador;
	
	public Jugador(String nombre) {
		cartasJugador = new ArrayList<Carta>();
		this.setNombre(nombre);
		//this.setCartasJugador(cincoCartas);
	}
	
	public void agregarCarta(Carta carta) {
		cartasJugador.add(carta);
	}
	
	public boolean contieneLaCarta(String carta) {
		boolean esMismaCarta = false;		
		for (Carta c : cartasJugador) {
			if(c.getNroYPalo().startsWith(carta)) {
				esMismaCarta = true;
			}
		}
		return esMismaCarta;
	}
	
	//GET Y SET
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Carta> getCartasJugador() {
		return cartasJugador;
	}

	public void setCartasJugador(List<Carta> cartas) {
		this.cartasJugador = cartas;
	}
}
