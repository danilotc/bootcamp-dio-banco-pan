package praticas.arrays;

import java.util.Scanner;

/*
 * Faça um programa que leia um vetor de 6 caracteres
 * e diga quantos caracteres foram lidos e quantas
 * consoantes foram digitadas.
 */

public class Exercicio02ContaEMostraConsoantes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		int totalConsoantes = 0;
		int cont = 0;
		
		do {
			System.out.print("Letra: ");
			String letra = scan.next();
			
			if (!(letra.equalsIgnoreCase("a") 
					|| letra.equalsIgnoreCase("e") 
					|| letra.equalsIgnoreCase("i") 
					|| letra.equalsIgnoreCase("o") 
					|| letra.equalsIgnoreCase("u"))) {
				consoantes[cont] = letra;
				totalConsoantes++;
			}
			
			cont++;
		} while(cont < consoantes.length);
		
		scan.close();
		
		System.out.print("Consoantes: ");
		for (String consoante : consoantes) {
			if (consoante != null) 
				System.out.print(consoante + " ");
		}
		
		System.out.println("\nQuantidade de Caracteres: " + consoantes.length);
		System.out.println("Quantidade de Consoantes: " + totalConsoantes);
	}
}
