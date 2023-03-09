package praticas.collections.stream.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPILambda {
	public static void main(String[] args) {
		/*
		 * Declarando lista com algumas strings aleatória
		 */
		List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		
		System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
		
		/*
		 * Pegando os 5 primeiro elementos da lista
		 * 
		 * Pre-requisito:
		 *   - java.util.Arrays
		 *   - java.util.List
		 *   - java.util.stream.Collectors
		 */
//		numerosAleatorios.stream()
//			.limit(5)
//			.collect(Collectors.toSet())
//			.forEach(System.out::println);
		
		
		
		
		
		
		/*
		 * Pegando os 5 primeiros elementos da lista 
		 * e colocando em outra lista, os elementos
		 * iguais não irão se repetir.
		 * 
		 * Pre-requisito:
		 *   - java.util.Arrays
		 *   - java.util.List
		 *   - java.util.Set
		 *   - java.util.stream.Collectors
		 */
//		Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
//				.limit(5)
//				.collect(Collectors.toSet());
//		System.out.println(numerosAleatorios5Primeiros);
		
		
		
		
		
		/*
		 * Pegando os 5 primeiros elementos da lista 
		 * e colocando em outra lista, os elementos
		 * iguais irão se repetir.
		 * 
		 * Pre-requisito:
		 *   - java.util.Arrays
		 *   - java.util.List
		 *   - java.util.stream.Collectors
		 */
		List<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
				.limit(5)
				.collect(Collectors.toList());
		System.out.println(numerosAleatorios5Primeiros);
	}
}