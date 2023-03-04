package praticas.poo.estrutura;

public class Main {
	public static void main(String[] args) {
		
		// cria instancia usando construtor padrao (vazio)
		Carro carro = new Carro();
		
		// defini valores para os atributos atraves dos metodos de acesso
		carro.setCor("Azul");
		carro.setModelo("Gol");
		carro.setCapacidadeTanque(27);
		
		// mostra valores definidos para os atributos atraves dos metodos de acesso
		System.out.println(carro.getCor());
		System.out.println(carro.getModelo());
		System.out.println(carro.getCapacidadeTanque());
		System.out.println(carro.valorTotalTanque(5.7));
		
		System.out.println();
		
		// cria instancia usando construtor sobrecarregado
		Carro carro2 = new Carro("Vermelho", "Volksvagem", 47);
		
		System.out.println(carro2.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.valorTotalTanque(4.2));
	}
}
