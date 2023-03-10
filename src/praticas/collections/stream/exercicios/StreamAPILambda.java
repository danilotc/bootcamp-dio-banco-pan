package praticas.collections.stream.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPILambda {
	public static void main(String[] args) {
		
		/*
		 * Declarando lista com algumas strings aleatória, porém essas strings
		 * são números que podem ser transformados em tipo numérico depois.
		 */
		List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		
		
		System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
		
		/*
		 * Pegando os 5 primeiro elementos da lista
		 * 
		 * Dependencias:
		 *   - java.util.Arrays
		 *   - java.util.List
		 *   - java.util.stream.Collectors
		 */
//		numerosAleatorios.stream()
//			.limit(5)
//			.collect(Collectors.toSet())
//			.forEach(System.out::println);
		
		
		
		
		
		/*
		 * Colocando os 5 elementos em outra lista do tipo Set, caso tenha
		 * elementos iguais, apenas um será inserido no Set.
		 * 
		 * Dependencias:
		 *   - java.util.Arrays
		 *   - java.util.List
		 *   - java.util.Set
		 *   - java.util.stream.Collectors
		 */
		Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
				.limit(5)
				.collect(Collectors.toSet());
		System.out.println(numerosAleatorios5Primeiros);
		
		
		
		
		
		/*
		 * Extra
		 * 
		 * Colocando os 5 elementos em outra lista do tipo List, caso tenha
		 * elementos iguais, ambos serão considerados e inseridos na List.
		 * 
		 * Dependencias:
		 *   - java.util.Arrays
		 *   - java.util.List
		 *   - java.util.stream.Collectors
		 */
//		List<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
//				.limit(5)
//				.collect(Collectors.toList());
//		System.out.println(numerosAleatorios5Primeiros);
	}
}