package praticas.collections.map.ordenacao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:

exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/

public class OrdenacaoMapExemplo {
	public static void main(String[] args) {
		/*
		 * 
		 */
		System.out.println("-----> Ordem aleatória");
        Map<String, Livro> meusLivros = new HashMap<>();
        
        meusLivros.put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        meusLivros.put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        meusLivros.put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        
        /*
         * 
         */
        System.out.println("\n-----> Ordem Inserção");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>();
        
        meusLivros1.put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        meusLivros1.put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        meusLivros1.put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        
        /*
         * 
         */
        System.out.println("\n-----> Ordem alfabética autores");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        
        /*
         * 
         */
        System.out.println("\n-----> Ordem alfabética nomes dos livros");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        
        /*
         * Não funcionou!
         */
        System.out.println("\n-----> Ordem número de página"); //Pra você
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPagina());
        for (Map.Entry<String, Livro> livro : meusLivros4)
        	System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());
	}
}


/*
 * Não funcionou!
 * 
 * Deixei esta classe no mesmo arquivo para analisar com calma depois
 * o motivo pelo qual não está funcionando.
 */
class ComparatorPagina implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Map.Entry<String, Livro> valor1, Map.Entry<String, Livro> valor2) {
		//return valor1.getValue().getPaginas().compareTo(valor2.getValue().getPaginas());
		return Integer.compare(valor1.getValue().getPaginas(), valor2.getValue().getPaginas());
	}
}