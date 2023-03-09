package praticas.collections.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
modelo = gol - consumo = 14,4km/l
modelo = uno - consumo = 15,6 km/l
modelo = mobi - consumo = 16,1 km/l
modelo = hb20 - consumo = 14,5 km/l
modelo = kwid - consumo = 15,6 km/l
*/
public class MapExemplo {
	public static void main(String[] args) {

//		Formas de iniciar uma collection do tipo Map/HashMap
		
//      Map carrosPopulares2020 = new HashMap(); //antes do java 5
//      Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
//      HashMap<String, Double> carrosPopulares = new HashMap<>();
//      Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)
		
		/*
		 * Criando uma instância de HashMap e atribuindo a uma variável do tipo Map
		 */
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        //cria
        Map<String, Double> carros = new HashMap<>();
        //insere dados
        carros.put("gol", 14.4);
        carros.put("uno", 15.6);
        carros.put("mobi", 16.1);
        carros.put("hb20", 14.5);
        carros.put("kwid", 15.6);
        //exibe
        System.out.println(carros.toString());

        
        /*
         * Substitua o consumo do gol por 15,2 km/h
         * 
         * put(chave, novoValor) --> insere ou atualiza elementos
         * 
         * O método para modificar o valor de uma determinada chave é o
         * mesmo utilizado para inserir os dados. Isso porque os dados
         * de um HashMap não são duplicados, então ao passar a chave o
         * valor antigo será substituído pelo novo valor informado.
         */
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carros.put("gol", 15.2);
        System.out.println(carros);

        
        /*
         * Confira se o modelo tucson está no dicionário
         * 
         * contains(chave) --> verifica se a chave existe
         * 
         * Retorna true se a chave informada como argumento existir na
         * lista, e retorna false caso não exista.
         */
        System.out.print("Confira se o modelo tucson está no dicionário: ");
        System.out.println(carros.containsKey("tucson"));

        
        /*
         * Exiba o consumo do uno
         * 
         * get(chave) --> retorna o valor da chave passada no argumento
         * 
         * Retorna o valor com base na chave informada como argumento
         * do método
         */
        System.out.print("Exiba o consumo do uno: ");
        System.out.println(carros.get("uno"));

        
        /*
         * Exiba o terceiro modelo adicionado
         * 
         * Não é possível porque não existe índice para obter o valor
         * em uma determionada posição.
         */
//		System.out.println("Exiba o terceiro modelo adicionado: ");

        
        /*
         * Exiba os modelos
         * 
         * keySet() --> retorna um Set com as chaves
         * 
         * Retorna um Set com as chaves do HashMap
         */
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        
        /*
         * Exiba os consumos dos carros
         * 
         * values() --> retorna uma collection com os valores
         * 
         * Retorna uma collection com todos os valores do dicionário,
         * por isso é possível armazenar em uma variável do tipo
         * Collection.
         */
        System.out.println("Exiba os consumos dos carros: ");
//        Collection<Double> consumos = carrosPopulares.values();
//        System.out.println(consumos);
        System.out.println(carros.values());

        
        /*
         * Exiba o modelo mais econômico e seu consumo
         * 
         * Collectons.max()
         * values()
         * entrySet()
         * getKey()
         * 
         * Set<Map.Entry<> <==> Entry<K,V>>
         * 
         * Todos estes métodos trabalham em conjunto para permitir a manipulação
         * de chaves e valores de forma separada.
         */
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carros.values()); //analisar
        Set<Entry<String, Double>> entries = carros.entrySet(); //analisar, antes era Map.entry<K, V>
        String modeloMaisEficiente = "";
        for (Entry<String, Double> entry : entries) //antes era Map.Entry<K, V>
        { 
            if (entry.getValue().equals(consumoMaisEficiente)) 
            {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " 
                		+ modeloMaisEficiente 
                		+ " - " 
                		+ consumoMaisEficiente);
            }
        }
        
        
        /*
         * Exiba o modelo menos econômico e seu consumo
         * 
         * Collections.min()
         * entrySet()
         * getValue()
         * getKey()
         * 
         * Set<Map.Entry<K,V> <==> Entry<K,V>
         * 
         * Todos estes métodos trabalham em conjunto para permitir a manipulação
         * de chaves e valores de forma separada.
         */
        System.out.println("Exiba o modelo menos econômico e seu consumo: " );

        Double consumoMenosEficiente = Collections.min(carros.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carros.entrySet()) 
        {
            if(entry.getValue().equals(consumoMenosEficiente)) 
            {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " 
                		+ modeloMenosEficiente 
                		+ " - " 
                		+ consumoMenosEficiente);
            }
        }

        
        /*
         * Exiba a soma dos consumos
         * 
         * values()
         * itaretor()
         * hasNext()
         * next()
         * 
         * Estes métodos trabalham em conjunto iterando sobre todos 
         * os elementos do dicionário para somar seus valores
         */
        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        
        /*
         * Exiba a média dos consumos deste dicionário de carros
         * 
         * size()
         * 
         * Retorna um valor inteiro que é o total de elementos que 
         * está contino no dicionário carros. Este valor será usado
         * como denominador para obter a média exigida
         */
        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carros.size()));

        
        /*
         * Remova os modelos com o consumo igual a 15,6 km/l
         * 
         * iterator()
         * hasNext()
         * next()
         * remove()
         * 
         * Esses métodos trabalham em conjunto para iterar sobre
         * todos os elementos do dicionário e remover aqueles
         * que foram solicitados.
         */
        System.out.println(carros);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carros.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) {
            	iterator1.remove();
            }
        }
        System.out.println(carros);

        
        /*
         * Exiba todos os carros na ordem em que foram informados
         * 
         * LinkedHashMap
         * put(chave, valor)
         * 
         * Isso é possível usando a estrutura do LinkedHashSMap que
         * organiza os elementos na ordem em que são inseridos
         */
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        //definição
        Map<String, Double> carros1 = new LinkedHashMap<>();
    	//inserção
        carros1.put("gol", 14.4);
    	carros1. put("uno", 15.6);
    	carros1.put("mobi", 16.1);
    	carros1.put("hb20", 14.5);
    	carros1.put("kwid", 15.6);
    	//exibição
        System.out.println(carros1.toString());

        
        /*
         * Exiba o dicionário ordenado pelo modelo
         * 
         * TreeMap
         * 
         * Isso é possível usando a estrutura do TreeMap que organiza
         * os dados por ordem aufabética.
         */
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carros2 = new TreeMap<>(carros1);
        System.out.println(carros2);

        
        /*
         * Apague o dicionario de carros
         * 
         * clear()
         * 
         * Apaga todos os dados inseridos no dicionário
         */
        System.out.println("Apague o dicionario de carros: ");
        carros.clear();
        carros1.clear();
        carros2.clear();
        System.out.println("Carros: " + carros);

        
        /*
         * Confira se o dicionário está vazio
         * 
         * isEmpty()
         * 
         * Retorna true se o dicionário estiver vazio, e false caso
         * tenha algum dado.
         */
        System.out.println("Confira se o dicionário está vazio: " + carros.isEmpty());
	}
}
