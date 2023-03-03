package praticas.estruturadados.listaencadeada;

public class ListaEncadeada<T> {
	
	/*
	 * Atributo genérico do tipo No<T>
	 */
	private No<T> referenciaEntrada;
	
	/*
	 * Construtor, ao instanciar objeto ele configura
	 * o atributo para nulo;
	 */
	public ListaEncadeada() {
		this.referenciaEntrada = null;
	}
	
	/*
	 * Retornar o conteúdo de um nó (elemento da lista)
	 */
	public T get(int index) {
		return getNo(index).getConteudo();
	}
	
	/*
	 * Método utilizado internamente por outros métodos 
	 * esta classe (private), pega indice de um elemento
	 * da lista e retorna a próxima referência.
	 */
	private No<T> getNo(int index) {
		
		validaIndice(index);
		
		No<T> noAuxiliar = referenciaEntrada;
		No<T> noRetorno = null;
		
		for (int i = 0; i <= index; i++) 
		{
			noRetorno = noAuxiliar;
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		return noRetorno;
	}
	
	/*
	 * Remove um elemento da lista
	 */
	public T remove(int index) {
		
		validaIndice(index);
		
		No<T> noPivor = getNo(index);
		if (index == 0) {
			referenciaEntrada = noPivor.getProximoNo();
			return noPivor.getConteudo();
		}
		
		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noPivor.getProximoNo());
		return noPivor.getConteudo();
	}
	
	/*
	 * Método utilizado internamente por outros métodos 
	 * esta classe (private), valida se o indice existe
	 */
	private void validaIndice(int index) {
		if (index >= size()) {
			int ultimoIndice = size()-1;
			throw new IndexOutOfBoundsException("Não existe conteudo no indice " 
					+ index 
					+ " desta lista. Esta lista só vai ate o indice " 
					+ ultimoIndice 
					+ ".");
		}
	}
	
	/*
	 * Adiciona elemento na lista
	 */
	public void add(T conteudo) {
		No<T> novoNo = new No(conteudo);
		if (isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAuxiliar = referenciaEntrada;
		for (int i = 0; i < size()-1; i++) {
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		noAuxiliar.setProximoNo(novoNo);
	}
	
	/*
	 * Verifica e retorna o tamanho da lista
	 */
	public int size() {
		int tamanhoLista = 0;
		No<T> referenciaAux = referenciaEntrada;
		
		while (true) {
			if (referenciaAux != null) {
				tamanhoLista++;
				if (referenciaAux.getProximoNo() != null) {
					referenciaAux = referenciaAux.getProximoNo();
				} 
				else break;
			} 
			else break;
		}
		
		return tamanhoLista;
	}
	
	/*
	 * Verifica se a referencia de entrada é nula, em outras
	 * palavras, se a lista está vazia.
	 */
	public boolean isEmpty() {
		return referenciaEntrada == null ? true : false;
	}

	//getter
	public No<T> getReferenciaEntrada() {
		return referenciaEntrada;
	}
	
	//setter
	public void setReferenciaEntrada(No<T> referenciaEntrada) {
		this.referenciaEntrada = referenciaEntrada;
	}

	@Override
	public String toString() {
		String strRetorno = "";
		No<T> noAuxiliar = referenciaEntrada;
		
		for (int i = 0; i < size(); i++) 
		{
			strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
			noAuxiliar = noAuxiliar.getProximoNo();
		}
		
		strRetorno += "null";
		return strRetorno;
	}
}