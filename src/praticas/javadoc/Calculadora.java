package praticas.javadoc;

/**
 * Esta calculadora faz as quatro operações básicas: somar,
 * subtrair, multiplicar e dividir.
 * 
 * @author Danilo Trindade
 * @version 1.0
 * @since 23/02/2023
 */
public class Calculadora {
	public static void main(String[] args) {
		int primeiroNumero = 5;
		int segundoNumero = 3;
		
		// Utilização do método
		int valorSomado = somar(primeiroNumero, segundoNumero);
		
		System.out.println(valorSomado);
	}
	
	/**
	 * Este método é utilizado para somar dois números inteiros
	 * 
	 * @param numeroUm é o primeiro parâmetro do método
	 * @param numeroDois é o segundo parâmetro do método
	 * @return int o resultado deste método é a soma dos dois números
	 */
	public static  int somar(int numeroUm, int numeroDois) {
		return numeroUm + numeroDois;
	}
	
	// TODO: implementar as outras operações (subtrair, multiplicar e dividir)
}
