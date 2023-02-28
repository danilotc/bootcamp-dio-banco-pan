package praticas.repeticao;

import java.util.Scanner;

/*
 * Faça um programa que leia 5 números 
 * e informe o maior número e a média
 * desses números.
 */

public class Exercicio03MaiorEMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float numero, maior = 0.0f, soma = 0.0f;
		int count = 0, divisor = 5;
		
		do {
			System.out.print("Numero: ");
			numero = scan.nextFloat();
			
			soma += numero;
			if (numero > maior) maior = numero;
			
			count++;
		} while(count < divisor);
		
		scan.close();
		
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + soma/divisor);
	}
}
