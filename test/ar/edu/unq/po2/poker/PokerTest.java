package ar.edu.unq.po2.poker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerTest {
	private List<Carta> cartas = new ArrayList<Carta>();
	private Jugador j1;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private Carta carta6;
	private Carta carta7;
	private Carta carta8;
	private Carta carta9;
	private Carta carta10;
	private PokerStatus poker;
	
	@BeforeEach
	void setUp() {
		j1 = new Jugador("fulano");
		carta1 = new Carta("1P");
		carta2 = new Carta("1D");
		carta3 = new Carta("1C");
		carta4 = new Carta("1T");
		carta5 = new Carta("JP");
		carta6 = new Carta("KT");
		carta7 = new Carta("10D");
		carta8 = new Carta("9P");
		carta9 = new Carta("8D");
		carta10 = new Carta("QP");
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		cartas.add(carta6);
		cartas.add(carta7);
		cartas.add(carta8);
		cartas.add(carta9);
		cartas.add(carta10);
		poker = new PokerStatus(j1,cartas);
		
		
	}
	
	@Test
	void cantidadDeCartasDelPoker() {
		assertEquals(poker.getCartas().size(),10);
	}
	@Test
	void ElJugadorTieneCuatroCartasIguales() {
		j1.agregarCarta(carta1);
		j1.agregarCarta(carta2);
		j1.agregarCarta(carta3);
		j1.agregarCarta(carta4);
		assertEquals(poker.verificar("1P", "1D", "1C", "1T", "JP"),true);
	}
	
	@Test
	void cantidadDeCartasDelJugador() {
		poker.agregarCarta();
		assertEquals(j1.getCartasJugador().size(),5);
	}

}
