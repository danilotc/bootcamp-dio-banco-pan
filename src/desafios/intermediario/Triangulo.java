package desafios.intermediario;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double perimetro, area;
		sc.close();
		
		//Implemente a condição necessária para o cálculo do triângulo:
        //Dica: Você pode utilizar o String.format() na formatação do texto.
		
		perimetro = A + B + C;
		area = ((A + B) * C) / 2;
		
		if((A < B + C) && (B < A + C) && (C < A + B)) {
			System.out.println("Perimetro = " + String.format("%.1f", perimetro));
		}else {
			System.out.println("Area = " + String.format("%.1f", area));
		}
	}
}
