package praticas.excecoes;

import javax.swing.JOptionPane;

public class UncheckedException {
	
	public static void main(String[] args) {
		/*
		 * O try irá tentar executar todas as instruções declaradas dentro dele e se
		 * todas as instrucoes forem executadas com consucesso, o fluxo do programa 
		 * após o bloco finally continuará.
		 */
		try {
			String numerador = JOptionPane.showInputDialog("Numerador");
			String denomidador = JOptionPane.showInputDialog("Denominador");
			
			int resultado = dividir(Integer.parseInt(numerador), Integer.parseInt(denomidador));
			System.out.println("Resultado: " + resultado);
		}
		/*
		 * Se alguma instrução dentro do bloco try não for executado com sucesso, por
		 * exemplo, digitando um texto no lugar do número, então este bloco catch será
		 * executado informando que o valor digitado está incorreto.
		 */
		catch (NumberFormatException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Valor inválido, digite um número inteiro.");
		}
		/*
		 * Se este bloco catch for executado significa que o usuário tentou dividir um
		 * valor por 0 causando um erro de aritmética o que resultará no lançamento da
		 * exceção chamada "ArithmentException", por isso cairá neste bloco.
		 */
		catch (ArithmeticException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Impossível dividir por 0.");
	    }
		/*
		 * Já o bloco finally sempre será executado independente do resultado obtido
		 * no bloco try ter sucesso ou não, exceto quando especificamos a parada do
		 * sistema de forma abrupta dentro de um dos blocos acima usando, por exemplo,
		 * a instrução System.exit(0).
		 */
		finally {
			System.out.println("bloco finally");
		}
		
		System.out.println("fluxo do programa");
	}
	
	/*
	 * Utilizada para calcular o valor de 2 variáveis inteiras e retornar
	 * o resultado da divisão que também será um valor do tipo inteiro.
	 */
	public static int dividir(int a, int b) { return a / b; }
}
