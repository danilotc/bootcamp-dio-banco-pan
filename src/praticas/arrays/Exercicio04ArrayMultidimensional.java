package praticas.arrays;

import java.util.Random;

/*Gere e imprima uma matriz M 4x4 
com valores aleatórios entre 0-9*/

public class Exercicio04ArrayMultidimensional {
	public static void main(String[] args) {
		Random random = new Random();
		
		//matriz de 4 linhas e 4 colunas (4x4)
		int[][] matriz = new int[4][4];
		
		//percorrendo cada linha
		for(int linha = 0; linha < matriz.length; linha++) 
		{
			//percorrendo cada coluna
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) 
			{
				//registra o numero aleatorio na matriz
				matriz[linha][coluna] = random.nextInt(9); //0-9
			}
		}
		
		System.out.println("Matriz (4x4):");
		//cada linha da matriz sera um vetor
		for(int[] linha : matriz)
		{
			//cada linha tem 4 colunas
			for (int coluna : linha)  
			{
				//mostra o valor de cada coluna do vetor linha
				System.out.print(coluna + " ");
			}
			System.out.println();
		}
	}
}