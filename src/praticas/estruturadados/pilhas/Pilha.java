package praticas.estruturadados.pilhas;

public class Pilha {
	
	private No refNoEntradaPilha;
	
	public Pilha() {
		this.refNoEntradaPilha = null;
	}
	
	public boolean isEmpty() {
//		if(refNoEntradaPilha == null) return true;
//		return false;
		return refNoEntradaPilha == null ? true : false;
	}
	
	public No top() {
		return refNoEntradaPilha; //retorna ref
	}
	
	public void push(No novoNo){ //acrescenta no na pilha
		No refAuxiliar = refNoEntradaPilha; //guarda referencia de entrada
		refNoEntradaPilha = novoNo; //ref agora eh o novo no
		refNoEntradaPilha.setRefNo(refAuxiliar); //muda referencia do antigo topo
	}
	
	public No pop() { //exclui o ultimo elemento
		if(!this.isEmpty()) { //se nao tiver nulo pega a ultima ref e aponta pra ela
			No noPoped = refNoEntradaPilha; //pega a ultima referencia
			refNoEntradaPilha = refNoEntradaPilha.getRefNo(); // pega o no mais abaixo
			return noPoped;
		}
		return null;
	}
	
	@Override
	public String toString() {
		String stringRetorno = "-------------\n";
		stringRetorno += "    Pilha\n";
		stringRetorno += "-------------\n";
		
		No noAuxiliar = refNoEntradaPilha;
		
		while (true) {
			if (noAuxiliar != null) {
				stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getRefNo(); //passa ser o proximo no
			} else {
				break;
			}
		}
		
		stringRetorno += "=============\n";
		
		return stringRetorno;
	}
}