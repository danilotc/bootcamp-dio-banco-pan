package desafios.bootcampoo.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<Dev> devsEscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Set<Dev> getDevsEscritos() {
		return devsEscritos;
	}
	
	public void setDevsEscritos(Set<Dev> devsEscritos) {
		this.devsEscritos = devsEscritos;
	}
	
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicial, descricao, devsEscritos, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Bootcamp bootcamp = (Bootcamp) obj;
		return Objects.equals(conteudos, bootcamp.conteudos) 
				&& Objects.equals(dataFinal, bootcamp.dataFinal)
				&& Objects.equals(dataInicial, bootcamp.dataInicial) 
				&& Objects.equals(descricao, bootcamp.descricao)
				&& Objects.equals(devsEscritos, bootcamp.devsEscritos) 
				&& Objects.equals(nome, bootcamp.nome);
	}
}
