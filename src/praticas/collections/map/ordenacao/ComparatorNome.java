package praticas.collections.map.ordenacao;

import java.util.Comparator;
import java.util.Map;

public class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> valor1, Map.Entry<String, Livro> valor2) {
        return valor1.getValue().getNome().compareToIgnoreCase(valor2.getValue().getNome());
    }
}