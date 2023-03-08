package praticas.collections.set.modelo;

import java.util.Objects;

public class Serie implements Comparable<Serie> {
	
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		
		Serie serie = (Serie) obj;
		
		return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}

	/*
	 * Necessário para trabalhar com TreeSet, este método precisa ser implementado
	 * porque esta classe passou a implementar a interface Comparable.
	 */
	@Override
	public int compareTo(Serie serie) {
		//se o resultado da comparacao for diferente de 0 retorna ordenado por tempo de episódio
		//porque o tempo de episódio não serão iguais
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0) return tempoEpisodio;
		
		//se o resultado for igual a 0 irá comparar e ordenar por gênero porque o tempo de
		//episódio são iguais e este será o critério de desempate
		return this.getGenero().compareTo(serie.getGenero());
	}
}
