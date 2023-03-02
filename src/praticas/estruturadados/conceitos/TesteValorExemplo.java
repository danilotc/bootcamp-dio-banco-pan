package praticas.estruturadados.conceitos;

//analisar este código com mais calma usando debug
public class TesteValorExemplo {
	
	//exemplo com primitivos, valor por copia
	public static void main(String[] args) {
		int intA = 1;
		int intB = intA;

		System.out.println("intA = " + intA + "; intB = " + intB);
		intA = 2;
		System.out.println("intA = " + intA + "; intB = " + intB);
	}
}
