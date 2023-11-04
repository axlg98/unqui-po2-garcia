package ar.edu.unq.po2.poker;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;

public class PokerStatus {
	
	private Jugador jugador;
	private List<Carta> cartas;
	
	public PokerStatus(Jugador jugador, List<Carta> cs) {
		//cartas = new ArrayList<Carta>();
		this.setJugador(jugador);
		this.setCartas(cs);
	}

	public void agregarCarta() {
		for(Carta carta : cartas) {
			if(jugador.getCartasJugador().size() < 5) {
				jugador.agregarCarta(carta);
			}
		}	
	}
	
	public boolean verificar(String c1, String c2, String c3, String c4, String c5) {
		List<String> strings = new ArrayList<String>();
		strings.add(c1);
		strings.add(c2);
		strings.add(c3);
		strings.add(c4);
		strings.add(c5);
		int cantidadDeCartasIguales = 0;
		
		for(String s : strings) {
			if(jugador.contieneLaCarta(s)) {
				cantidadDeCartasIguales += 1;
			}
		}
		
//		if(jugador.contieneLaCarta(c1)) {
//			cantidadDeCartasIguales += 1;
//		}
//		if(jugador.contieneLaCarta(c2)) {
//			cantidadDeCartasIguales += 1;
//		}
//		if(jugador.contieneLaCarta(c3)) {
//			cantidadDeCartasIguales += 1;
//		}
//		if(jugador.contieneLaCarta(c4)) {
//			cantidadDeCartasIguales += 1;
//		}
//		if(jugador.contieneLaCarta(c5)) {
//			cantidadDeCartasIguales += 1;
//		}
		
		return cantidadDeCartasIguales == 4;
	}
	
	//GET Y SET
	
	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	
}
