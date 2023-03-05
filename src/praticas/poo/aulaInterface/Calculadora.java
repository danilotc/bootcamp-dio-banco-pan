package praticas.poo.aulaInterface;

public class Calculadora implements OperacaoMatematica {

	@Override
	public int somar(int a, int b) {
		return a + b;
	}

	@Override
	public int subtrair(int a, int b) {
		return a - b;
	}

	@Override
	public int multiplicar(int a, int b) {
		return a * b;
	}

	@Override
	public float dividir(float a, float b) {
		return a / b;
	}
}
