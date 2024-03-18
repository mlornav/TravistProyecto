package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testConstructorCorrecto() {
		Calculadora calculadora = new Calculadora();
		calculadora.setA(4);
		calculadora.setB(2);
		assertEquals(4, calculadora.getA());
		assertEquals(2, calculadora.getB());
	}

	@Test
	public void testSumar() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.Sumar(4, 2);
		assertEquals(6, resultado); // Esperamos que 4 + 2 sea igual a 6
	}

	@Test
	public void testRestar() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.restar(4, 2);
		assertEquals(2, resultado); // Esperamos que 4 - 2 sea igual a 2
	}

	@Test
	public void testMultiplicar() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.multiplicar(4, 2);
		assertEquals(8, resultado); // Esperamos que 4 * 2 sea igual a 8
	}

	@Test
	public void testDivision() {
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.division(4, 2);
		assertEquals(2, resultado); // Esperamos que 4 / 2 sea igual a 2
	}

	@Test
	public void testDivisionCero() {
		Calculadora calculadora = new Calculadora();
		//Comprobamos que se lanza correctamente ArithmeticException al dividr un número por cero
		assertThrows(ArithmeticException.class, () -> {
			calculadora.division(4, 0);
		});
	}
}
