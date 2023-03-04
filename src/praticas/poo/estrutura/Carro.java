package praticas.poo.estrutura;

public class Carro {
	private String cor;
	private String modelo;
	private int capacidadeTanque;
	
	// construtor padrao
	public Carro() {
	}
	
	// construtor sobrecarregado (sobrecarga)
	public Carro(String cor, String modelo, int capacidadeTanque) {
		//essa boa pratica aprendi em outro curso, até o construtor
		//deve chamar os metodos para modificar os atributos
		setCor(cor);
		setModelo(modelo);
		setCapacidadeTanque(capacidadeTanque);
	}
	
	// metodos acessores get e set
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}
	
	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	// metodo personalizado, calcula o valor total para encher o tanque
	public double valorTotalTanque(double valorCombustivel) {
		return this.capacidadeTanque * valorCombustivel;
	}
}
