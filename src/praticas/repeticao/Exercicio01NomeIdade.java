package praticas.repeticao;

import java.util.Scanner;

public class Exercicio01NomeIdade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true){
			System.out.print("Nome: ");
			nome = scan.next();
			
			if(nome.equals("0")) break;
			
			System.out.print("Idade: ");
			idade = scan.nextInt();
			
			System.out.printf("Sou %s e tenho %d anos%n%n", nome, idade);
		}
		
		scan.close();
		System.out.println("Fim do programa");
	}
}
