package desafios.intermediario;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String AN1, AN2, AN3;

		// Garantindo que as entradas serão todas minúsculas
		AN1 = sc.nextLine().toLowerCase();
		AN2 = sc.nextLine().toLowerCase();
		AN3 = sc.nextLine().toLowerCase();
		
		sc.close();

		//TODO: Implemente as condição necessária para que seja verificado que tipo de animal é:
               //Dica: Você pode utilizar o método equals para realizar comparações.
		if (AN1.equals("vertebrado")){
			if (AN2.equals("ave")) {
				if (AN3.equals("carnivoro")) {
					System.out.println("aguia");
				} 
				else {
					System.out.println("pomba");
				}
			} 
			else {
				if (AN3.equals("onivoro")) {
					System.out.println("homem");
				} 
				else {
					System.out.println("vaca");
				}
			}
		}
		else {
			if(AN2.equals("inseto")) {
				if (AN3.equals("hematofago")) {
					System.out.println("pulga");
				}
				else {
					System.out.println("lagarta");
				}
			}
			else {
				if (AN3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else {
					System.out.println("minhorca");
				}
			}
		}
	}
}