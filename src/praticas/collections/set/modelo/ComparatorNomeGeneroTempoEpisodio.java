package praticas.collections.set.modelo;

import java.util.Comparator;

public class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
	
	@Override
	public int compare(Serie serie1, Serie serie2) {
		//o primeiro critério será ordenar por nome, se os nomes forem 
		//diferentes de 0 irá ordenar por nome
		int nome = serie1.getNome().compareTo(serie2.getNome());
		if (nome != 0) return nome;
		
		//o segundo critério será ordenar por genero, se os generos forem
		//diferentes de 0 irá ordenar por genero
		int genero = serie1.getGenero().compareTo(serie2.getGenero());
		if (genero != 0) return genero;
		
		//o terceiro critério será ordenar por tempo de episódio, se os tempos
		//forem diferentes de 0 irá ordenar por tempo de episódio
		return Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
	}
}
