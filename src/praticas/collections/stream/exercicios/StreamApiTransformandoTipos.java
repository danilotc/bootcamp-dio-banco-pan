package praticas.collections.stream.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamApiTransformandoTipos {

	public static void main(String[] args) {

		/*
		 * Criando uma lista de String para analisar alguns conceitos
		 * referentes ao uso da API de Stream.
		 */
		List<String> numerosAleatorios = 
				Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		
		
		
		
		/*
		 * Functional Interface
		 * 
		 * Transformando os dados da lista com String para tipo Integer
		 * usando interface funcional.
		 * 
		 * Dependencias:
		 *    java.util.Arrays
		 *    java.util.List
		 *    java.util.function.Function
		 */
//		numerosAleatorios.stream()
//			.map(new Function<String, Integer>() {
//				
//				@Override
//				public Integer apply(String s) {
//					return Integer.parseInt(s);
//				}
//			})
//			.forEach(System.out::println); //imprimindo no console os dados ja transformados
		
		
		
		
		
		/*
		 * Lambda Expression
		 * 
		 * Forma simplificada do código acima usando expressão lambda, contudo
		 * ainda é possível simplificar mais esta linha de código.
		 */
//		numerosAleatorios.stream()
//			.map(s -> Integer.parseInt(s));
		
		
		
		
		
		/*
		 * Reference Method
		 * 
		 * Essa é a forma mais utilizada por profissionais e pela comunidade,
		 * ela faz exatamente o que os códigos acima fazem que é transformar
		 * os elementos da lista em inteiros 'parseando'.
		 * 
		 * Dependencias:
		 *    java.util.Arrays
		 *    java.util.List
		 */
//		numerosAleatorios.stream()
//			.map(Integer::parseInt);
		
		
		
		
		
		/*
		 * Usando a simplificação até Reference Method irei imprimindo os 
		 * elementos para conferir se deu tudo certo.
		 * 
		 * Dependencias:
		 *    java.util.Arrays
		 *    java.util.List
		 */
//		numerosAleatorios.stream()
//			.map(Integer::parseInt)
//			.forEach(System.out::println);
		
		
		
		
		
		/*
		 * O método toList da classe Collectors pega informações de uma lista
		 * e coloca em outra lista do tipo List. Poderia ser uma outra lista
		 * do tipo Set, basta usar o método toSet para isso.
		 * 
		 * Dependencias:
		 *    java.util.Arrays
		 *    java.util.List
		 *    java.util.stream.Collectors
		 */
		List<Integer> collectList = numerosAleatorios.stream()
			.map(Integer::parseInt)
			.collect(Collectors.toList());
		System.out.println("List de Inteiros: " + collectList);
		// Saída: [1, 0, 4, 1, 2, 3, 9, 9, 6, 5]
		
		
		// Armazenando os inteiros em uma collection do tipo Set, sabemos que
		// essa estrutura nao aceita elementos duplicados, então a guantidade
		// de elementos será menor do que na collection list anterior.
		// Esse código faz a mesma coisa da alternativa acima, a diferença é
		// que não está em uma versão simplificada usando reference method.
		Set<Integer> collectSet = numerosAleatorios.stream()
			.map(new Function<String, Integer>() {
				@Override
				public Integer apply(String t) {
					return Integer.parseInt(t);
				}
			})
			.collect(Collectors.toSet());
		System.out.println("Set de Inteiros: " + collectSet);
		// Saída: [0, 1, 2, 3, 4, 5, 6, 9]
	}
}