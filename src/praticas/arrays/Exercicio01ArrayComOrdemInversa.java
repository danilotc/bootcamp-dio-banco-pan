package praticas.arrays;

/*
 * Crie um vetor de números inteiros e mostre-os
 * na ordem inversa.
 */
public class Exercicio01ArrayComOrdemInversa {
	public static void main(String[] args) {
	
		int[] vetor = {-9, -4, 72, 23, 8, 3};
		int cont = 0;
		
		System.out.print("Vetor: ");
		while (cont < (vetor.length)) {
			System.out.print(vetor[cont] + " ");
			cont++;
		}
		
		System.out.print("\nVetor: ");
		for (int i = (vetor.length-1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}
	}
}