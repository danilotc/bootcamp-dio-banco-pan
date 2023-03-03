package desafios.basico;

/*
 * Estava importando todas as classes do pacote util: java.util.*
 * e como estou usando apenas a classe Scanner, modifiquei para
 * otimizar o programa e não carregar classes desnecessárias.
 */
import java.util.Scanner;

public class Dragao { 
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int casos, poderDeLuta;
        
        casos = ler.nextInt();
        
        for(int i = 0; i < casos; i++){
            poderDeLuta = ler.nextInt();
            
            //Implemente a condição adequada para a impressão dos textos 
            //conforme o solicitado no desafio:
            if (poderDeLuta > 8000) {
                System.out.println("Mais de 8000!");
            } else {
                System.out.println("Inseto!");
            }
        }
        
        /*
         * Sempre adiciono esta instrução para evitar vazamento
         * de recurso, até porque minha IDE emite um warning do
         * tipo 'Resource leak'.
         */
        ler.close();
    }
}