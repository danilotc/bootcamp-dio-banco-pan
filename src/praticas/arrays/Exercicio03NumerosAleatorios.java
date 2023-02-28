package praticas.arrays;

import java.util.Random;

/*Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
e armazene-os num vetor. Ao final mostre os números e seus sucessores.*/

public class Exercicio03NumerosAleatorios {
	public static void main(String[] args) {
		
		//usando a classe random
		Random random = new Random();
		
		//criando um array para guardar os numeros
		int[] numerosAleatorios = new int[20];
		
		//guardando numeros aleatorios no array
		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		//mostrando numeros aleatorios do array
		System.out.print("Numeros aleatorios...................: ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		
		//mostrando os antecessores dos numeros aleatorios (bonus)
		System.out.print("\nAntecessores dos numeros aleatorios..: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero-1) + " ");
		}
		
		//mostrando sucessores dos numeros aleatorios
		System.out.print("\nSucessores dos numeros aleatorios....: ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero+1) + " ");
		}
	}
}