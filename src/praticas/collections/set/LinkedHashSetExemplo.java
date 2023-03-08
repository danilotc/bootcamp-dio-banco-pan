package praticas.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

import praticas.collections.set.modelo.Serie;

public class LinkedHashSetExemplo {
	public static void main(String[] args) {
		/*
		 * Ordem de inserção
		 */
		Set<Serie> series = new LinkedHashSet<>();
		
		series.add(new Serie("got", "fantasia", 60));
		series.add(new Serie("dark", "drama", 60));
		series.add(new Serie("that", "'70s show", 25));
		
		/*
		 * Imprimindo elementos
		 */
		for(Serie serie : series)
			System.out.println(serie.getNome()
					+ " - " + serie.getGenero()
					+ " - " + serie.getTempoEpisodio());

	}
}
