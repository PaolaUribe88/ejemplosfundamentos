import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemuneracionTest {

	@Test
	void testCalculoRemuneracionNoImponible() {
		Colaborador colaborador = new Colaborador();
		colaborador.setSueldoBase(500000);
		colaborador.setMovilizacion(50000);
		colaborador.setColacion(60000);
		LiquidacionSueldo liquidacionSueldo = new LiquidacionSueldo (colaborador);
		int montoNoImponible = liquidacionSueldo.calcularMontoNoImponible();
		assertEquals(montoNoImponible, 110000);
	}
	@Test
	void testCalculoRemuneracionNoImponible2() {
		Colaborador colaborador = new Colaborador();
		colaborador.setSueldoBase(0);
		colaborador.setMovilizacion(0);
		colaborador.setColacion(60000);
		LiquidacionSueldo liquidacionSueldo = new LiquidacionSueldo (colaborador);
		int montoNoImponible = liquidacionSueldo.calcularMontoNoImponible();
		assertEquals(montoNoImponible, 60000);
	}

}
