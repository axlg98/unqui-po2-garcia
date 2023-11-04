package ar.edu.unq.po2.color;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ColorTest {

	public Color proximoColor(Color unColor) {
		 Color[] color = Color.values();
		 int proximo = unColor.ordinal() + 1;
		 Color siguienteColor = color[proximo];
		 return siguienteColor;
	 }
	
	@Test
	void siguienteColorTest() {
		System.out.println(this.proximoColor(Color.AMARILLO));
	}

}
