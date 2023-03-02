package praticas.estruturadados.conceitos;

//analisar este exemplo com mais calma usando debug
public class TesteReferenciaMain{
	
	//valor por referencia eh um conceito usado atraves de objetos
	public static void main(String[] args){
		TesteReferenciaClasse obj1 = new TesteReferenciaClasse(1);
		TesteReferenciaClasse obj2 = obj1;
		
		System.out.println(obj1);
		System.out.println(obj2);
		obj2.setNum(2);
		System.out.println(obj2);
	}
}
