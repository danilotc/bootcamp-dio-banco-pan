package desafios.basico;

import java.util.Scanner;

public class FabricaDeCarros {
	public static void main(String[] args) {
		
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
