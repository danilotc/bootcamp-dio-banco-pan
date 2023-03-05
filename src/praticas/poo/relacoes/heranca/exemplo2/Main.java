package praticas.poo.relacoes.heranca.exemplo2;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * instancia padrao da classe Funcionario, nao ha upcast nem downcast,
		 * apenas a instancia de uma classe com o tipo dela mesma
		 */
		Funcionario funcionario = new Funcionario();
		
		/* 
		 * instância do tipo Upcast
		 * 
		 *   - tipo de transformação implícita;
		 *   - classe filha é transformada em classe mãe;
		 *   - instância da classe especializada com tipo da classe genérica;
		 *   - pode ser usado sem problemas.
		 */
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		
		/* 
		 * instância do tipo Downcast
		 * 
		 *   - precisa ser explícito;
		 *   - classe mãe é transformada em classe filha;
		 *   - assim como nos tipos primitivos, em classes há perda de recursos
		 *     que foram implementados na classe genérica, mas não tem na classe
		 *     especializada, como atributos e metodos, por exemplo;
		 *   - por isso deve ser evitado porque gera exceção do tipo ClassCastException.
		 */
		//Gerente gerente2 = (Gerente) new Funcionario();
		//Vendedor vendedor2 = (Vendedor) new Funcionario();
	}
}
