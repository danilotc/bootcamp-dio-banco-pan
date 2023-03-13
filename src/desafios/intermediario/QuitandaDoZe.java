package desafios.intermediario;

import java.util.Scanner;

public class QuitandaDoZe {
	
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        input.close();
        
        // Implemente as condições necessárias para retornar o preço a ser pago 
        // pelo cliente, conforme a tabela de preços do seu Zé:
        
        // [0] ==> valor ate 5kg, [1] ==> valor acima de 5kg
        double[] valorMorango = {2.5, 2.2};
        double[] valorMaca = {1.8, 1.5};
        double valorCompra = 0.0;
        
        // calcula valor da compra
        if ((morangos <= 5) && (macas <= 5)) {
            valorCompra = morangos * valorMorango[0] + macas * valorMaca[0];
        } 
        else {
        	if ((morangos <= 5) && (macas > 5)) {
        		valorCompra = morangos * valorMorango[0] + macas * valorMaca[1];
        	}
        	else if ((morangos > 5) && (macas <= 5)) {
        		valorCompra = morangos * valorMorango[1] + macas * valorMaca[0];
        	}
        	else if ((morangos > 5) && (macas > 5)) {
        		valorCompra = morangos * valorMorango[1] + macas * valorMaca[1];
        	}
        }
        
        // calcula 10% de desconto
        if ((valorCompra > 25.0) || (morangos + macas > 8)) {
        	valorCompra = valorCompra - valorCompra * 0.1;
        }
        
        System.out.println(valorCompra);
    }
}