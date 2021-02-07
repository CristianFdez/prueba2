public class archivo1 {
	
	/**
	 * Declaro varios valores para hacer las operaciones de resta,
	 * 2 valores reales y 3 enteros, y resultado como valor de la soluci�n
	 * y acumulado para guardar el valor donde acumulo.
	 */
	private double a, b, resultado, acumulado;
	private int c, d, f;
	
	/**
	 * Declaro el constructor sin nada, vac�o.
	 */
	public archivo1() {
		super();
	}

	/**
	 * Declaro el constructor con todos los valores.
	 */
	public archivo1(double a, double b, int c, int d, int f) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.f = f;
	}

	/**
	 *  M�todo para restar n�meros reales.
	 */
	public double restaReales() {
		resultado = a - b;
		return resultado;
	}

	/**
	 *  M�todo para restar n�meros enteros.
	 */
	public double restaEnteros() {
		resultado = c - d;
		return resultado;
	}

	/**
	 *  M�todo para restar tres n�meros.
	 */
	public double restaTres() {
		resultado = c - d - f;
		return resultado;
	}

	/**
	 *  M�todo para restar n�mero acumulado.
	 */
	public void restaAcumulado() {
		resultado = c - c;

	}

}