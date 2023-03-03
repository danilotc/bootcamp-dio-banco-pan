package desafios.basico;

import java.util.Scanner;

public class CalculaHComNTermos {

	public static void main(String[] Args) {

		double h = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			// Calcule o valor de H de forma que resulte na soma dos termos:
			h += (double) 1/i;
		}
		
		// Imprima a soma dos termos, considerando um resultado com duas casas
		// decimais:
		System.out.printf("%.0f",h);
	}
}