package desafios.intermediario;

import java.util.Scanner;

public class ContaEspacosEVogais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine().toLowerCase();
		String[] strSplit = str.split(" ");
		sc.close();

		char[] arrVogais = { 'a', 'e', 'i', 'o', 'u' };
		int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

		for (String item : strSplit) {
			// Implemente condições (laços) adequados para que possamos contar os espaços em
			// brancos e as vogais que existem na string.
			// Dica: Você pode utilizar o Character.toLowerCase em sua condição:
			for (int i = 0; i < item.length(); i++) {
				for (int j = 0; j < arrVogais.length; j++) {
					if (item.charAt(i) == arrVogais[j]) {
						quantVogais += 1;
					}
				}
			}
		}
		System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
	}
}
