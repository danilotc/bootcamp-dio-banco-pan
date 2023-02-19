package praticas.atalhos;

import java.util.Objects;

public class Cliente {
	private String nome;
	private String email;
	private Integer idade;
	
	public Cliente() {}

	public Cliente(String nome, String email, Integer idade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(email, other.email) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}
}