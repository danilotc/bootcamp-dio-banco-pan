# Entendendo a Documentação Java

Esta prática foi realizada para entender melhor o uso das anotações utilizadas para criar documentações das classes e métodos de um programa Java.

|Tag|Descricao|
|---|---|
@author|Autor / Criador
@version|Versao do recurso disponibilizado
@since|Data de início da disponibilização do recurso
@param|Descrição dos parâmetros dos métodos criados
@return|Descrição do tipo de retorno de um método
@throws|Se o método lança alguma exceção

## Gerando documentação

Para gerar um documento com base em todos os comentários de documentação `/** ... */` inseridos no projeto pode-se usar como exemplo a seguinte instrução no terminal:

```
javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java
```

Exemplo prático de comentários de documentação, veja a classe **Calculadora.java** para analisar o exemplo completo.

```
/**
 * Esta calculadora faz as quatro operações básicas de
 * somar, subtrair, multiplicar e dividir.
 * 
 * @author Danilo Trindade
 * @version 1.0
 * @since 23/02/2023
 */
public class Calculadora {
	/**
	 * Este método é utilizado para somar dois números inteiros
	 * 
	 * @param numeroUm é o primeiro parâmetro do método
	 * @param numeroDois é o segundo parâmetro do método
	 * @return int o resultado deste método é a soma dos dois números
	 */
	public static  int somar(int numeroUm, int numeroDois) {
		return numeroUm + numeroDois;
	}
}
```

## Saber mais sobre documentação Java

A partir das referências abaixo é possível entender mais sobre como gerar documentação dos projetos desenvolvidos em Java, explorar cada uma das tags e empregá-las cada vez mais de forma apropriada.

- [en] [Java SE Documentation](https://docs.oracle.com/javase/7/docs/technotes/tools/windows/javadoc.html)
- [en] [Gerando Documentação](https://dev.java/learn/jvm/tools/core/javadoc)
- [pt] [Documentação](https://glysns.gitbook.io/java-basico/sintaxe/documentacao)

---

Ver [outras práticas](https://github.com/danilotc/bootcamp-dio-banco-pan/tree/main/src/praticas)