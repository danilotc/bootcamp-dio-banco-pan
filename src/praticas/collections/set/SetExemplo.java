package praticas.collections.set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExemplo {
	public static void main(String[] args) {
//		Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

		/*
		 * Definindo uma coleção do tipo Double com a classe HashSet
		 * implementando a interface Set e guardando essa instância
		 * na variável 'notas'.
		 * 
		 * As notas estão sendo inseridas como argumento da classe
		 * HashSet que recebe uma collecton do tipo Arrays e retorna 
		 * um HashSet
		 * 
		 * asList() --> método da classe Arrays que recebe uma list
		 * e retorna uma collection do tipo Arrays.
		 * .
		 */
		Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 0d, 3.6));
		System.out.println(notas.toString());
		
		
		/*
		 * Exibir a posição da nota 5.0
		 * 
		 * Não é possível exibir a posição de uma nota porque
		 * não há como trabalhar com índice na collection set
		 */
//		System.out.println("Exibir a posição da nota 5.0:");
		
		
		/*
		 * Adicionar a nota 8.0 na posição 4
		 * 
		 * Novamente, não é possível adicionar uma nota em determinada
		 * posição porque não há índices para indicar o local exato de
		 * inserção
		 */
//		System.out.println("Adicionar a nota 8.0 na posição 4:");
		
		
		/* 
		 * Substituir a nota 5.0 por 6.0
		 * 
		 * Não é possível substituir uma nota por outra porque não há
		 * o método set() implementado nessa collection, método usado
		 * para realizar essa ação em outras collections como a List
		 */
//		System.out.println("Substituir a nota 5.0 por 6.0:");
		
		
		/*
		 * Conferir se a nota 5.0 existe na coleção
		 * 
		 * .contains(valor)
		 * 
		 * verifica se um determinado valor existe na coleção, este
		 * método retorna um valor booleano true ou false.
		 */
		System.out.println("Conferir se a nota 5.0 existe: " + notas.contains(5.0));
		
		
		/*
		 * Exibir a terceira nota
		 * 
		 * Não é possível exibir uma nota baseado na sua posição,
		 * pois não há índices para realizar buscas.
		 */
//		System.out.println("Exibir a terceira nota:");
		
		
		/*
		 * Collections.min(collection)
		 * 
		 * Necessário importação da classe Collections existente no 
		 * pacote util: java.util.Collections
		 */
		System.out.println("Exibir a menor nota: " + Collections.min(notas));
		
		
		/*
		 * Collections.max(collection)
		 * 
		 * Necessário importação da classe Collections existente no
		 * pacote util: java.util.Collections
		 */
		System.out.println("Exibir a maior nota: " + Collections.max(notas));
		
		
		/*
		 * Exibir a soma dos valores
		 * 
		 * Para isso será necessário usar o método iterator() da coleção,
		 * percorrer todos os elementos com while, verificar se existe
		 * algum elemento depois usando o método hasNext() e pegar esse
		 * elemento usando o método next(), caso exista.
		 */
		System.out.print("Exibir a soma dos valores: ");
		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);
		
		
		/*
		 * Exibir a média das notas
		 * 
		 * size()
		 * 
		 * O método é usado para retornar o tamanho da coleção, que é a
		 * quantidade de elementos que existe nela, assim podemos usar
		 * esse retorno como denominador para obter o resultado
		 */
		System.out.println("Exibir a média das notas: " + soma / notas.size());
		
		
		/*
		 * Remover a nota 0 (zero)
		 * 
		 * remove(element)
		 * 
		 * Método usado para remover um determinado elemento, bastando
		 * passar o elemento como argumento. O método retorna um valor
		 * booleano true ou false indicando se o valor foi removido:
		 * 
		 * true  --> foi removido porque foi encontrado na lista
		 * false --> não foi removido porque não foi encontrado na lista
		 */
		System.out.println("Remover a nota 0: " + notas.remove(0d));
		System.out.println(notas);
		
		
		/*
		 * Remover a nota da posição 0
		 * 
		 * Não é possível remover um elemento baseado em sua posição,
		 * isso porque não há índice nessa coleção.
		 */
//		System.out.println("Remover a nota da posição 0: ");
		
		
		/*
		 * Remover notas menores que 7
		 * 
		 * remove()   --> remove elemento
		 * iterator() --> itera sobre os elementos da coleção
		 * hasNext()  --> verifica se há próximo
		 * next()     --> pega o próximo elemento
		 * 
		 * Para isso será necessário usar o método iterator() da coleção,
		 * percorrer todos os elementos com while, verificar se existe
		 * algum elemento depois usando o método hasNext() e pegar esse
		 * elemento usando o método next(), caso exista.
		 * 
		 * Em seguida, verificar se o valor capturado pelo método next()
		 * é menor que 7, se for será removido usando o método remove()
		 */
		System.out.println("Remover notas menores que 7: ");
		Iterator<Double> iterator2 = notas.iterator();
		while(iterator2.hasNext()) {
			Double proximo = iterator2.next();
			if(proximo < 7.0) iterator2.remove();
		}
		System.out.println(notas);
	}
}