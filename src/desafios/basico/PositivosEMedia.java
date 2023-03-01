package desafios.basico;

import java.util.Locale;
import java.util.Scanner;

public class PositivosEMedia {
	public static void main(String[] args) {
		/*
		 * Estou usando a classe Locale para poder digitar valores decimais
		 * separados por ponto ( . ) no lugar de vírgula, evitando erro de
		 * exceção InputMismatchException.
		 */
		Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
		
		int cont = 0;
		double positivos = 0.0;
		double media = 0.0;
		double x;
		
		for (int i = 0; i < 6; i++) {
			x = leitor.nextDouble();
			if(x > 0.0) {
				positivos += x;
				cont++;
			}
		}
		leitor.close();
		
		media = positivos / cont;
		System.out.println(cont + " valores positivos");
		System.out.println(String.format("%.1f", media));
	}
}