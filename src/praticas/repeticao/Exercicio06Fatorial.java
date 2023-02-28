package praticas.repeticao;

import java.util.Scanner;

/*
 * Faça umprograma que calcule o fatorial de um
 * número inteiro fornecido pelo usuário
 * 
 * Ex.: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */

public class Exercicio06Fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Fatorial: ");
		int fatorial = scan.nextInt();
		
		int multiplicacao = 1;
		
		System.out.print(fatorial + "! = ");
		for (int cont = fatorial; cont > 0; cont--) {
			multiplicacao *= cont;
		}
		
		scan.close();
		
		System.out.println(multiplicacao);
	}
}