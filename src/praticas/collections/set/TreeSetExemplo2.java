package praticas.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import praticas.collections.set.modelo.ComparatorNomeGeneroTempoEpisodio;
import praticas.collections.set.modelo.Serie;

public class TreeSetExemplo2 {
	public static void main(String[] args) {
		/*
		 * Ordem de inserção, precisamos de uma collection para
		 * poder trabalhar com TreeSet, isso porque o método
		 * getAll recebe uma collection como argumento
		 */
		Set<Serie> series = new LinkedHashSet<>();

		series.add(new Serie("got", "fantasia", 60));
		series.add(new Serie("dark", "drama", 60));
		series.add(new Serie("that", "'70s show", 25));

		/*
		 * Ordem Nome / Gênero / TempoEpisodio
		 * 
		 * Foi necessário criar uma classe para implementar a interface
		 * Comarator, esta classe está na pasta model com o método 
		 * compare implementado, foi obrigatório.
		 */
		Set<Serie> series2 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());

		series2.addAll(series);

		for (Serie serie : series)
			System.out.println(serie.getNome() 
					+ " - " + serie.getGenero() 
					+ " - " + serie.getTempoEpisodio());
	}
}