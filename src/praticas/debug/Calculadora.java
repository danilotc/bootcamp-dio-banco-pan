package praticas.debug;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
		int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: ");
		a = input.nextInt();
		System.out.print("Digite o segundo numero: ");
		b = input.nextInt();
		input.close();
		
		int soma = somar(a, b);
		int subtracao = subtrair(a, b);
		int multiplicacao = multiplicar(a, b);
		float divisao = dividir(a, b);
		
		System.out.println("soma=" + soma);
		System.out.println("subtracao=" + subtracao);
		System.out.println("multiplicacao=" + multiplicacao);
		System.out.println("divisao=" + divisao);		
	}
	
	public static int somar(int x, int y) {
		return x + y;
	}
	
	public static int subtrair(int x, int y) {
		return x - y;
	}
	
	public static int multiplicar(int x, int y) {
		return x * y;
	}
	
	/**
	 * <b>5 / 2 == 2.5 e não 2</b>. Este erro estava acontecendo porque
	 * o método estava recebendo e retornando valores do tipo inteiro 
	 * quando deveria ser float ou double.
	 * 
	 * @param x
	 * @param y
	 * @return float
	 */
	public static float dividir(float x, float y) {
		return x / y;
	}
}
