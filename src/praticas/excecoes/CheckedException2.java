package praticas.excecoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedException2 {
	
	public static void main(String[] args) {
        String nomeDoArquivo = "arquivo.txt";
        
        /*
         * O método main está chamando o método imprimirArquivoNoConsole, este método 
         * que está sendo chamado pode causar dois tipos de problemas, esses problemas
         * irão gerar exceções. Por isso, o método está lançando esses problemas para
         * este método que está chamando a função onde ocorreu o problema.
         * 
         * Obs.: o método está lançando os problemas através da exceção mais genérica 
         * dentro da hierarquia das exceções que podem acontecer dentro deste método, 
         * neste caso a exceção lançada foi IOException. Por este motivo este método 
         * que chamou precisará tratar estes problemas e por isso estamos usando 
         * try-catch.
         */
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        } 
        /*
         * Este bloco será executado quando algum erro acontecer durante a leitura e
         * escrita do arquivo.
         */
        catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,
                    "Revise o nome do arquivo que você deseja imprimir! " + e.getCause());
            e.printStackTrace();
        } 
        /*
         * Este bloco será executado quando houver algum problema na verificação inicial
         * do arquivo, por exemplo, arquivo não encontrado.
         */
        catch (IOException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro inesperado! Entre em contato com o suporte! " + e.getCause());
        } 
        finally {
            System.out.println("Chegou no finally!");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException 
    {
        File file = new File(nomeDoArquivo);

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
