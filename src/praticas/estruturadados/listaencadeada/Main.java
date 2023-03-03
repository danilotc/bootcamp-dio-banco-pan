package praticas.estruturadados.listaencadeada;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();
		
		minhaListaEncadeada.add("lista1");
		minhaListaEncadeada.add("lista2");
		minhaListaEncadeada.add("lista3");
		minhaListaEncadeada.add("lista4");
		
		System.out.println(minhaListaEncadeada.get(0));
		System.out.println(minhaListaEncadeada.get(1));
		System.out.println(minhaListaEncadeada.get(2));
		System.out.println(minhaListaEncadeada.get(3));
		
		System.out.println(minhaListaEncadeada);
		
		System.out.println(minhaListaEncadeada.remove(3));
		
		System.out.println(minhaListaEncadeada);
	}
}