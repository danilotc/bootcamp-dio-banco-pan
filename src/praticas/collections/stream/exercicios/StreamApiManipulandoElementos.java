package praticas.collections.stream.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiManipulandoElementos {
	
	public static void main(String[] args) {
		
		/*
		 * Criando uma lista de String para analisar alguns conceitos
		 * referentes ao uso da API de Stream.
		 */
		List<String> numerosAleatorios = 
				Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		
		
		
		
		/*
		 * Pegue os números pares maiores que 2 e coloque em uma lista 
		 */
//		List<Integer> listaParesMaioresQue2 = numerosAleatorios.stream()
//			.map(Integer::parseInt)
//			.filter(i -> (i %2 == 0 && i > 2))
//			.collect(Collectors.toList());
//			//.forEach(System.out::println);
//		System.out.println(listaParesMaioresQue2);
		
		
		
		
		
		/*
		 * Mostre a média dos números
		 */
//		numerosAleatorios.stream()
//			.mapToInt(Integer::parseInt)
//			.average()
//			.ifPresent(System.out::println);
		
		
		
		
		/*
		 * Remover os valores ímpares
		 */
		List<Integer> numeros = numerosAleatorios.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		numeros.removeIf(inteiro -> inteiro % 2 != 0);
		System.out.println(numeros);
	}
}
