package praticas.collections.map.ordenacao;

import java.util.Objects;

public class Livro {
	
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Livro livro = (Livro) obj;
		return nome.equals(livro.nome) && paginas.equals(livro.paginas);
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", paginas=" + paginas + "]";
	}
}