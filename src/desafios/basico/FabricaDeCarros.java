package desafios.basico;

import java.util.Scanner;

public class FabricaDeCarros {

	public static void main(String[] args) {
		
		/*
		 * O programa espera três valores inteiros que representam o custo
		 * de fábrica, as porcentagens do distribuidor e os impostos.
		 * 
		 * Como saída o programa mostra o valor final de um carro novo.
		 * 
		 * Entradas     Saída
		 * 20000        34600
		 * 28
		 * 45
		 * 
		 * Entradas     Saída
		 * 30000        36000
		 * 10
		 * 10
		 */
		
		Scanner scan = new Scanner(System.in);
		int custoFabrica = scan.nextInt();
		int porcentagemDistribuidor = scan.nextInt();
		int percentualImposto = scan.nextInt();
		scan.close();

		int custoConsumidor;
		int distribuidor;
		int valorImposto;
		
		distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
		
		// Implementei esses dois cálculos
		valorImposto = (custoFabrica * percentualImposto) / 100;
		custoConsumidor = custoFabrica + valorImposto + distribuidor;
		
		System.out.println(custoConsumidor); // e mostrei o valor final de um carro novo
	}
}
