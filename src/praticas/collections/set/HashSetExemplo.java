package praticas.collections.set;

import java.util.HashSet;
import java.util.Set;

import praticas.collections.set.modelo.Serie;

/*
Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:

(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

public class HashSetExemplo {
	public static void main(String[] args) {
		/*
		 * Ordem aleatória
		 */
		Set<Serie> series = new HashSet<>();
		
		series.add(new Serie("got", "fantasia", 60));
		series.add(new Serie("dark", "drama", 60));
		series.add(new Serie("that", "'70s show", 25));
		
		/*
		 * Percorre e imprime cada um dos valores da collection
		 */
		for(Serie serie : series) 
			System.out.println(serie.getNome() 
					+ " - " + serie.getGenero() 
					+ " - " + serie.getTempoEpisodio());
	}
}