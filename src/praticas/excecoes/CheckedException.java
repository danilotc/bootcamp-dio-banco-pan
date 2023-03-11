package praticas.excecoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CheckedException {
	
	public static void main(String[] args) throws IOException 
	{
        String nomeDoArquivo = "arquivo.txt";
        imprimirArquivoNoConsole(nomeDoArquivo);
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException 
    {
        File file = new File(nomeDoArquivo);

        /*
         * Acontece um erro se o arquivo não estiver na raiz, neste caso a raiz não é
         * o diretório src, é o diretório do projeto, um diretório acima do src.
         */
        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line=br.readLine();
        } while(line != null);
        bw.flush();
        br.close();
    }
}
