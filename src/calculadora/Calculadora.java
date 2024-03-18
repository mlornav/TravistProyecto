package calculadora;

public class Calculadora {
	// Variables
	private int a;
	private int b;

	// Constructor vacío
	public Calculadora() {

	}

	/**
	 * Función para obtener el valor de a
	 * 
	 * @author User
	 * @return a
	 * @version 1.0
	 */

	public int getA() {
		return a;
	}

	/**
	 * Función para poner un valor para a
	 * 
	 * @author User
	 * @param int a
	 * @version 1.0
	 */

	public void setA(int a) {
		this.a = a;
	}

	/**
	 * Función para obtener el valor de b
	 * 
	 * @author User
	 * @return b
	 * @version 1.0
	 */

	public int getB() {
		return b;
	}

	/**
	 * Función para poner un valor para b
	 * 
	 * @author User
	 * @param int b
	 * @version 1.0
	 */

	public void setB(int b) {
		this.b = b;
	}

	/**
	 * @author User
	 * @param a - Primer valor de tipo int
	 * @param b - Segundo valor de tipo int
	 * @return a + b - Devuelve la suma de los dos valores pasados por parámetro
	 * @version 1.0
	 */

	public int Sumar(int a, int b) {
		return a + b;
	}

	/**
	 * @author User
	 * @param a - Primer valor de tipo int
	 * @param b - Segundo valor de tpo int
	 * @return a - b - Devuelve la resta de los dos valores pasados por parámetro
	 * @version 1.0
	 */

	public int restar(int a, int b) {
		return a - b;
	}

	/**
	 * @author User
	 * @param a - Primer valor de tipo int
	 * @param b - Segundo valor de tipo int
	 * @return a * b - Devuelve la multiplicación de los dos valores pasados por
	 *         parámetro
	 * @version 1.0
	 */

	public int multiplicar(int a, int b) {
		return a * b;
	}

	/**
	 * @author User
	 * @param a - Primer valor de tipo int
	 * @param b - Segundo valor de tipo int
	 * @return a / b - Devuelve la división de los dos valores pasados por
	 *         parámetro. En el caso de ser b = 0 lanza la excepción
	 *         ArithmeticException()
	 * @version 1.0
	 */

	public int division(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}

}
