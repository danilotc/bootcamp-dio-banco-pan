package praticas.repeticao;

import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares 
 * e a quantidade de números ímpares
 */

public class Exercicio04ParEImpar {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantNumeros, numero, count = 0;
		int quantPares = 0, quantImpares = 0;
		
		System.out.print("Quantidade de numeros: ");
		quantNumeros = scan.nextInt();
		
		do {
			System.out.print("Numero: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) quantPares++;
			else quantImpares++;
			
			count++;
		} while(count < quantNumeros);
		
		scan.close();
		
		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade Impar: " + quantImpares);
	}
}
