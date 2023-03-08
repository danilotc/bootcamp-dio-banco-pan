package praticas.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import praticas.collections.set.modelo.Serie;

public class TreeSetExemplo {
	public static void main(String[] args) {
		/*
		 * Ordem de inserção com LinkedHashSet
		 * 
		 * Collection necessária para alimentar a collection TreeSet
		 */
		Set<Serie> series = new LinkedHashSet<>();
		
		series.add(new Serie("got", "fantasia", 60));
		series.add(new Serie("dark", "drama", 60));
		series.add(new Serie("that", "'70s show", 25));
		
		/*
		 * Ordem natural (TempoEpisodio) com TreeSet
		 * 
		 * A collection 'series2' do tipo TreeSet está sendo inicializada
		 * através de outra collection passada como argumento
		 */
		Set<Serie> series2 = new TreeSet<>(series);
		
		/*
		 * Percorrendo os valores na collection 'series2' e imprimindo
		 * cada um deles.
		 */
		for(Serie serie : series2)
			System.out.println(serie.getNome()
					+ " - " + serie.getGenero()
					+ " - " + serie.getTempoEpisodio());
	}
}
