package praticas.estruturadados.conceitos;

public class TesteReferenciaClasse {
	private Integer num;
	
	public TesteReferenciaClasse(Integer num){
		this.num = num;
	}
	
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public Integer getNum() {
		return num;
	}
	
	@Override
	public String toString() {
		return "Objeto: " + this.getNum();
	}
}
