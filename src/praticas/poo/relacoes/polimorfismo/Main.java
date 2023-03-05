package praticas.poo.relacoes.polimorfismo;

class Main {
	public static void main(String[] args) {
		
		//vetor do tipo ClasseMae armazenando objetos
		ClasseMae[] classes = new ClasseMae[] {
				new ClasseFilha1(),
				new ClasseFilha2(), 
				new ClasseMae()
		};
		
		for(ClasseMae classe : classes) { //for-each
			/*
			 * [0] polimorfismo, ha heranca, metodo1 da instancia atual foi executado
			 * [1] polimorfismo, ha heranca, metodo1 da instancia atual foi executado
			 * [2] não ha polimorfismo, nao ha heranca, objeto do mesmo tipo do vetor
			 */
			classe.metodo1();
		}

		System.out.println();
		
		for(ClasseMae classe : classes) { //for-each
			/*
			 * [0] nao ha polimorfismo, nao existe metodo2 na classe filha, usou da classe mae
			 * [1] polimorfismo, ha heranca, por isso metodo2 da instancia atual foi executado
			 * [2] nao ha polimorfismo porque nao ha heranca, objeto do mesmo tipo do vetor
			 */
			classe.metodo2();
		}
		
		System.out.println();
		
		ClasseFilha2 classeFilha2 = new ClasseFilha2();
		classeFilha2.metodo2(); // sobrescrita, ha metodo2 na instancia atual
	}
}