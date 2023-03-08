package praticas.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoListExemplo {
	public static void main(String[] args) {

		/*
		 * Esta forma de criar uma lista do tipo List existe que um
		 * serial UID seja implementado.
		 */
//		List<Gato> meusGatos = new ArrayList<>(){{
//			add(new Gato("Jon", 12, "preto"));
//			add(new Gato("Simba", 6, "tigrado"));
//			add(new Gato("Jon", 18, "amarelo"));
//		}};
		
		List<Gato> meusGatos = new ArrayList<>();
		
		meusGatos.add(new Gato("Jon", 12, "preto"));
		meusGatos.add(new Gato("Simba", 6, "tigrado"));
		meusGatos.add(new Gato("Jon", 18, "amarelo"));
		
		/*
		 * Está ordenando os dados!
		 */
		//meusGatos.sort(Comparator.comparing(Gato::getNome)); // argumento de comparing, o que faz?
		
		System.out.println("Ordem de Inserção");
		System.out.println(meusGatos);
		
		/*
		 * Ordem aleatória usando o método shuffle() da classe Collections!
		 */
		System.out.println("\nOrdem aleatória");
		Collections.shuffle(meusGatos); // ordem aleadoria
		System.out.println(meusGatos);
		
		/*
		 * Implementamos a interface Comparable e seu método compareTo,
		 * mas não estamos usando este método aqui, por que? tudo isso
		 * foi feito apenas para explicar sobre a interface Comparable
		 * e a Collections?
		 * 
		 * Se eu criar um collection do tipo List ou ArrayList e quiser
		 * ordenar os elementos por ordem natual, preciso usar a classe
		 * Collections chamando o método sort passando como argumento o
		 * objeto com os dados que serão ordenados.
		 * 
		 * Por isso aqui estamos fazendo assim, o sort dessa classe está
		 * implementando a interface Comparable que também está sendo
		 * implementado na classe Gato que deu origem a lista meusGatos.
		 */
		System.out.println("\nOrdem Natural (Nome)");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		
		System.out.println("\nOrdem Idade");
		// Collections.sort(meusGatos, new ComparatorIdade());
		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		
		System.out.println("\nOrdem cor");
		// Collections.sort(meusGatos, new ComparatorCor());
		meusGatos.sort(new ComparatorCor());
		System.out.println(meusGatos);
		
		
		System.out.println("\nOrdem Nome/Cor/Idade");
		// Collections.sort(meusGatos, new ComparatorNomeCorIdade());
	    meusGatos.sort(new ComparatorNomeCorIdade());
	    System.out.println(meusGatos);
	}
}





/*
 * Se deseja ordenar uma coleção de listas do tipo string na ordem
 * alfabética, será necessário implementar a classe com a interface
 * Comparable, além do seu método obrigatório compareTo()
 */
class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" + "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
    
    /*
     * Obrigatoriamente teremos que implementar este método para
     * ordenar os dado sdo List de forma natural pelo nome
     */
    @Override
    public int compareTo(Gato gato) {
    	/*
    	 * Esta é a implementação que foi realizada pegando o atributo nome,
    	 * chamando o método compareTo ou compareToIgnoreCase e passando como
    	 * argumento o atributo nome do objeto para ser comparado e retornando
    	 * seu resultado que será: -1 ou 0 ou 1.
    	 * 
    	 * -1 --> os nomes sao diferentes, será colocado antes.
    	 * 0  --> os nomes são iguais, assim o critério de ordenação será um próximo atributo da coleção.
    	 * 1  --> os nomes são diferentes, será colocado depois.
    	 * 
    	 * Mas não estamos usando isso lá no main, por quê? La estamos usando o método
    	 * sort da classe Collections
    	 * 
    	 */
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}





class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}





class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}





class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}