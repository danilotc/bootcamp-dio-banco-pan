package praticas.repeticao;

import java.util.Scanner;

/*
 * Faça um programa que peça uma nota entre zero e dez e mostre
 * uma mensagem caso o valor seja inválido e continue pedindo até
 * que o usuário informe um valor inválido
 */

public class Exercicio02Nota{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.print("Nota: ");
		nota = scan.nextInt();
		
		while(nota < 0 || nota > 10) {
			System.out.print("Nota invalida! Digite novamente: ");
			nota = scan.nextInt();
		}
		scan.close();
	}
}
