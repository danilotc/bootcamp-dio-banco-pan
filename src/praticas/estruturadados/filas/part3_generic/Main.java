package praticas.estruturadados.filas.part3_generic;

public class Main {

	public static void main(String[] args) {
		
		Fila<String> minhaFila = new Fila<>();
		
		minhaFila.enqueue("primeiro");
		minhaFila.enqueue("segundo");
		minhaFila.enqueue("terceiro");
		minhaFila.enqueue("quarto");
		
		System.out.println(minhaFila); //mostra fila
		
		System.out.println(minhaFila.dequeue()); //tirar o primeiro da fila
		
		System.out.println(minhaFila); //mostra fila sem o primeiro elemento
		
		System.out.println(minhaFila.first()); //mostra o primeiro da fila
		
		System.out.println(minhaFila); //mostra fila
		
		minhaFila.enqueue("quinto"); //adiciona mais um na fila
		
		System.out.println(minhaFila); //mostra fila com mais 1 elemento
	}
}