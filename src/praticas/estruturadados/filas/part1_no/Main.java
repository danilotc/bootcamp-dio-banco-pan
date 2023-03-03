package praticas.estruturadados.filas.part1_no;

public class Main {

	public static void main(String[] args) {
		
		Fila minhaFila = new Fila();
		
		minhaFila.enqueue(new No("primeiro"));
		minhaFila.enqueue(new No("segundo"));
		minhaFila.enqueue(new No("terceiro"));
		minhaFila.enqueue(new No("quarto"));
		
		System.out.println(minhaFila); //mostra fila
		
		System.out.println(minhaFila.dequeue()); //tirar o primeiro da fila
		
		System.out.println(minhaFila); //mostra fila sem o primeiro elemento
		
		System.out.println(minhaFila.first()); //mostra o primeiro da fila
		
		System.out.println(minhaFila); //mostra fila
		
		minhaFila.enqueue(new No("quinto")); //adiciona mais um na fila
		
		System.out.println(minhaFila); //mostra fila com mais 1 elemento
	}
}