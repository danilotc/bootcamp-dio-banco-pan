package praticas.collections.stream.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIFunctionInterface {
	public static void main(String[] args) {
		/*
		 * Declarando uma lista de String, porém cada string é  um número inteiro
		 * que, posteriormente, será transformado em outra lista de números.
		 */
		List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		 
		/*
		 * Imprima todos os elementos dessa lista de String
		 * 
		 * Resolução desse exercício foi utilizando Function Interface, neste
		 * caso, a interface funcional que estamos usando é a Consumer e ela,
		 * por ser uma interface, obriga a impelmentação do método accept.
		 * 
		 * SAM (Single Abstract Method) interface que possui apenas uma único
		 * método abstrato.
		 */
		System.out.println("Imprima todos os elementos dessa lista de String: ");
		
		numerosAleatorios.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);
			}
		});
		
	}
}
