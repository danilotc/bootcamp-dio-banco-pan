package desafios.basico;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int N = leitor.nextInt(); leitor.close();
        int proximo, anterior = 0, atual = 1;
        
        for (int i = 1; i <= N; i++) {
            if (i == N) System.out.println(anterior);
            else System.out.print(anterior + " ");
            
            //Implemente a condição ideal para que possamos 
            //obter os valores solicitados:
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}