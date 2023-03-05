package praticas.poo.aulaInterface;

public class UsandoCalculadora {
	
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		System.out.println(c.somar(5, 2));
		System.out.println(c.subtrair(5, 2));
		System.out.println(c.multiplicar(5, 2));
		System.out.println(c.dividir(5, 2));
	}
}
