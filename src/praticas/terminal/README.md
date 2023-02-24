# Programa no Terminal

Esta prática foi desenvolvida para treinar (no meu caso relembrar) o processo de execução de um programa Java via terminal, incluindo passagens de parâmetros recebidos pelo método main. A seguir listarei alguns passos que são utilizados para realizar essa "jornada".

## Executando via terminal

Considerei a classe **MinhaClasse.java**

```
public class MinhaClasse {
	public static void main(String[] args) {
		System.out.println("Ebaaa, fui executado pelo Terminal.");
	}
}
```

1. Compilei o arquivo via IDE;
1. Abri o terminal (Ctrl+Alt+T - no linux);
1. Acessei o local onde está meu arquivo .class (se usou IDE estará na pasta `bin`);
1. Depois digitei o seguinte comando para rodar o programa:

```
java MinhaClasse
```

Esse processo pode ser conferido no vídeo que gravei para ajudar alguns colegas na faculdade que estavam com dificuldades para realizar exatamente este processo. O vídeo não tem áudio porque gravei em um computador cujo áudio não era possível sair na gravação. 

Clique no vídeo abaixo para conferir.

[![Video mostrando java no terminal](https://raw.githubusercontent.com/danilotc/assets/master/java-no-terminal.png)](https://drive.google.com/file/d/1f416zkkWa2qylGGtm4m1xMlnNjLZERjl/view)

## Executando via terminal com parâmetros

Considerando a classe **SobreMim.java** as seguintes implementações foram realizadas

```
public class SobreMim {
	public static void main(String[] args) {
		String nome = args[0];
		String sobrenome = args[1];
		int idade = Integer.valueOf(args[2]);
		double altura = Double.valueOf(args[3]);
		
		System.out.println("Olá, me chamo " + nome + " " + sobrenome);
		System.out.println("Tenho " + idade + " anos");
		System.out.println("Minha altura é " + altura + "cm");
	}
}
```

Seguindo o mesmo processo anterior, abri o terminal e digitei o seguinte comando para rodar o programa, **a diferença está em passar os argumentos após o nome da classe separados por espaço**, da seguinte forma.

```
java SobreMim Danilo Trindade 35 1.85
```

Os dados do argumento estão separados por índices, começando por 0:

1. `Danilo` está na posição 0 do array, por isso foi digitado primeiro;
1. `Trindade` está na posição 1 do array;
1. `35` está na posição 2 e;
1. `1.85` na posição 3.


## Usando Scanner para passagem dos parâmetros

Novamente considerando a classe anterior e fiz as seguintes modificações

```
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome");
		String nome = entrada.next();
		
		System.out.println("Digite seu sobrenome");
		String sobrenome = entrada.next();
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		
		System.out.println("Digite sua altura");
		double altura = entrada.nextDouble();
		
		entrada.close();
		
		// código oculto
	}
}
```

A mudança aconteceu na entrada dos dados, por exemplo: onde tinha `Integer.valueOf(args[2])` passou a ter `entrada.nextInt()` onde "entrada" é a referência para o objeto da classe Scanner e ".nextInt()" é um dos teus métodos.

**Sem Scanner eu fazia assim**

```
// executa o programa já passando os parametros
java SobreMim Danilo Trindade 35 1.85
```

**Com Scanner eu faço assim**

```
// executa o programa
java SobreMim

// antes de imprimir, preciso informar os dados que serão solicitados
Digite seu nome
Danilo
Digite seu sobrenome
Trindade
Digite sua idade
35
Digite sua altura
1.85
```

Estes são alguns métodos da classe Scanner:

1. `.next()` captura String
1. `.nextInt()` captura valores inteiros
1. `.nextDouble()` captura valores com casas decimais
1. e outros, para cada tipo primitivo existe um next correspondente...

---

Ver [outras práticas](https://github.com/danilotc/bootcamp-dio-banco-pan/tree/main/src)