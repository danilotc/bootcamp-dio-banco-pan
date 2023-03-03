package praticas.estruturadados.listaduplaencadeada;

public class Main {
	
	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();
		
		minhaListaEncadeada.add("c1");
		minhaListaEncadeada.add("c2");
		minhaListaEncadeada.add("c3");
		
		System.out.println(minhaListaEncadeada);
		
		minhaListaEncadeada.remove(1);
		minhaListaEncadeada.add(1, "c8");
		
		System.out.println(minhaListaEncadeada);
	}
}
