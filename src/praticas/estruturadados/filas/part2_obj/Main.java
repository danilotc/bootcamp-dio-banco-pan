package praticas.estruturadados.filas.part2_obj;

public class Main {

	public static void main(String[] args) {
		
		Fila minhaFila = new Fila();
		
		minhaFila.enqueue("primeiro");
		minhaFila.enqueue(true);
		minhaFila.enqueue("terceiro");
		minhaFila.enqueue(1);
		
		System.out.println(minhaFila); //mostra fila
		
		System.out.println(minhaFila.dequeue()); //tirar o primeiro da fila
		
		System.out.println(minhaFila); //mostra fila sem o primeiro elemento
		
		System.out.println(minhaFila.first()); //mostra o primeiro da fila
		
		System.out.println(minhaFila); //mostra fila
		
		minhaFila.enqueue("quinto"); //adiciona mais um na fila
		
		System.out.println(minhaFila); //mostra fila com mais 1 elemento
	}
}