package ar.edu.unq.po2.templateMethod;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Empleadotest {
	EmpleadoTemporareo empTemp;
	EmpleadoPasante empPasante;
	EmpleadoPlanta empPlanta;
	
	@BeforeEach
	void setUp() {
		empTemp    = new EmpleadoTemporareo(true,true);
		empPasante = new EmpleadoPasante();
		empPlanta  = new EmpleadoPlanta(2);
	}
	
	@Test
	void sueldoEmpTempTest() {
		empTemp.setSueldoBasico(1000);
		empTemp.setCantHora(3);
		empTemp.pagoDeSueldo();
		assertEquals(1115,empTemp.getSueldoTotal(),"No es el sueldo correcto");
	}
	
	@Test
	void sueldoEmpPasanteTest() {
		empPasante.setSueldoBasico(0);
		empPasante.setCantHoraPorMes(3);
		empPasante.pagoDeSueldo();
		assertEquals(2880,empPasante.getSueldoTotal(),"No es el sueldo correcto");
	}
	
	@Test
	void sueldoEmpPlantaTest() {
		empPlanta.setSueldoBasico(3000);
		empPlanta.setCantDeHijos(3);
		empPlanta.pagoDeSueldo();
		assertEquals(3450,empPlanta.getSueldoTotal(),"No es el sueldo correcto");
	}

}
