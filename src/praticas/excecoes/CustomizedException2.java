package praticas.excecoes;

import javax.swing.JOptionPane;

/*
 * TRATAMENTOS REALIZADOS
 * 
 * 1 - avisa que a divisao nao sera exata, nao faz a operacao, nao estoura excecao.
 * 2 - trata a excecao ArithmeticException (divisao por 0), tambem nao faz a operacao.
 * 3 - trata a excecao ArrayIndexOutOfBoundsException (tamanho do array 'numerador')
 * 
 * Obs.: O tratamento de excecao 3 verifica que nao existe numero na posicao 4 do 
 * array 'numerador' para realizar a divisao por 8 do denominador, por isso estoura 
 * essa exception. Isso ocorre porque o criterio do loop esta sendo o tamanho do 
 * denominador, que eh maior que o tamanho do numerador.
 */
public class CustomizedException2 {
	
	public static void main(String[] args) {
		
		int[] numerador = {4, 5, 8, 10};
		int[] denominador = {2, 4, 0, 2, 8};
		
		for (int i = 0; i < denominador.length; i++) {
			try {
				/*
				 * Verifica se o denominador eh igual a 0, se for verdadeiro sera 
				 * criado uma nova exception chamada DivisaoPorZeroException com 
				 * uma mensagem especifica indicando o problema. Esta mensagem 
				 * sera apresentada ao usuario assim que a excecao cair no bloco 
				 * catch que trata especificamente a divisao por 0.
				 */
				if (denominador[i] == 0) 
					throw new DivisaoPorZeroException ("Impossivel dividir por 0.");
				
				/*
				 * Verifica se o numerador eh impar, se for verdadeiro a divisao 
				 * ira resultar em um numero com casas decimais, porem estamos 
				 * trabalhando com numeros inteiros, significa que o resultado 
				 * sera truncado. É um atratamento para indicar este problema 
				 * e trata-lo de forma diferente, usando por exemplo, outro  
				 * tipo de dado.
				 */
				if (numerador[i] % 2 != 0) 
					throw new DivisaoNaoExataException("Divisao nao exata!");
				
				// Se tudo estiver correto realiza a divisao e mostrar no console
				int resultado = numerador[i] / denominador[i];
				System.out.println(resultado);
			} 
			/*
			 * Este bloco catch captura a excecao criada no bloco try para mostrar 
			 * a uma mensagem especifica que foi criada para alertar o usuario do
			 * problema ocorrido, a divisao por 0.
			 */
			catch (DivisaoPorZeroException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			/*
			 * Ja este bloco catch captura a excecao criada no bloco try para 
			 * mostrar a mensagem personalizada sobre a divisao nao exata.
			 */
			catch(DivisaoNaoExataException e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			/*
			 * Este bloco catch informa que o numero de operando eh insuficiente 
			 * para realizar a operacao. Isso acontece porque um array eh menor 
			 * que outro...
			 * 
			 * Nao criei uma classe para tratar esta exception porque nao consegui 
			 * identificar onde posso criar a instancia da excecao.
			 * 
			 * Tentei usar o fluxo if(numerador < denominador), mas quando faco isso 
			 * a instancia eh criada 2x, uma pelo fato que o tamanho do numerador ser
			 * menor que o tamanho do denominador, e outro por nao encontrar o index 
			 * no numerador para dividir por 8 do denominador.
			 * 
			 * Por isso, decidi trata-lo diretamente.
			 */
			catch(IndexOutOfBoundsException e) {
				JOptionPane.showMessageDialog(null, "Numero insuficiente de operando.");
			}
		}
		
		System.out.println("O programa continua...");
	}
}

/*
 * Esta classe foi criada para tratar uma propriedade aritimética 
 * que resulta em um número com casas decimais:
 * 
 * NumeroÍmpar / NumeroPar = NumeroQuebrado
 * 
 * Porém o resultado será inteiro ignorando a parte decimal. Como 
 * uma exceção não irá estourar, está sendo tratado dessa forma.
 */
class DivisaoNaoExataException extends Exception {
	
	private static final long serialVersionUID = 1L; //IDE indicou necessidade

	public DivisaoNaoExataException(String message) {
		super(message);
	}
}

/*
 * Esta classe foi criada para tratar a exceção ArithmeticException 
 * quando um número for dividido por zero.
 */
class DivisaoPorZeroException extends Exception {
	
	private static final long serialVersionUID = 1L; //IDE indicou necessidade

	public DivisaoPorZeroException(String message) {
		super(message);
	}
}