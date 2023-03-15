package desafios.intermediario;

import java.util.Locale;
import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
		
		double renda = leitor.nextDouble();
		leitor.close();
		double imposto = 0.0;

		// Agora utilizando estrutura condicional implemente em seu código as
		// condições necessárias para o cálculo da taxa de imposto de renda:
		boolean faixa1 = renda <= 2000.0;
		boolean faixa2 = renda <= 3000.0;
		boolean faixa3 = renda <= 4000.0;
		double calculoFaixa2 = (renda - 2000.0) * 0.08;
		double calculoFaixa3 = 1000.0 * 0.08 + (renda - 3000.0) * 0.18;
		double calculoFaixa4 = 1000.0 * 0.08 + 1500.0 * 0.18 + (renda - 4500.0) * 0.28;
		
		if (faixa1) {
			System.out.println("Isento");
		}
		else if (faixa2) {
			imposto = calculoFaixa2;
		}
		else if (faixa3) {
			imposto = calculoFaixa3;
		}
		else {
			imposto = calculoFaixa4;
		}
		
		if(imposto != 0.0) System.out.printf("R$ %.2f", imposto);
	}
}
