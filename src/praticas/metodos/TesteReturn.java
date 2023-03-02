package praticas.metodos;

public class TesteReturn {
	
	public static void main(String[] args) {
		naoContarAte5();
	}
	
	/* Este método foi criado para testar o uso da palavra-chave 'return'
	 * em um método sem retorno ( void ). Realmente ele funciona como se
	 * fosse o break das estruturas de loop, interrompendo a execução do
	 * método quando ele é executado.
	 * 
	 * Saída: 1 2 3 
	 */
	public static void naoContarAte5() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if(i == 3) return;
		}
		System.out.println("Eu não serei impresso");
	}
}
