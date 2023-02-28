package praticas.repeticao;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada capaz de gerar a tabuada de
 * qualquer número inteiro entre 1 e 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 *
 * Tabuada do 5:
 * 5 X 1 = 5
 * 5 x 2 = 10
 * ...
 * 5 x 10 = 50
 */

public class Exercicio05Tabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual tabuada deseja ver? ");
		int tabuada = scan.nextInt();
		
		// limita a tabuada entre 1 e 10
		if (tabuada < 1 || tabuada > 10) {
			while (true) {
				System.out.print("Valor inválido! Digite outro número: ");
				tabuada = scan.nextInt();
				if (tabuada >= 1 && tabuada <= 10) break;
			}			
		}
		
		System.out.printf("Tabuada do %d:\n", tabuada);
		for (int count = 1; count <= 10; count++) {
			System.out.printf("%d X %d = %d\n", tabuada, count, (tabuada * count));
		}
		
		scan.close();
	}
}