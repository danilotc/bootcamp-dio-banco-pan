package praticas.excecoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

/*
 * Tratando exceções de forma desacoplada
 * 
 * A verificação/leitura do arquivo está em um método, a responsabilidade 
 * de leitura, escrita e impressão estão em outro, isso é o que se chama 
 * descoplar responsabilidades (?)
 */
public class CustomizedException {
	
	public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } 
        /*
         * O método lerArquivo lançou a exceção ImpossivelAberturaDeArquivoException 
         * para que fosse tratado aqui, neste método, por isso foi criado mais este 
         * bloco catch para tratar a exceção FileNotFoundException quando acontecer 
         * apresentando uma mensagem personalizada ao usuário.
         */
        catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        } 
        /*
         * Este bloco será executado quando qualquer outra exception diferente de
         * FileNotFoundException acontecer, sendo caracterizado como inesperado.
         */
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    /*
     * Este método é responsável por ler o arquivo e verificar se existe, 
     * isso pode lançar uma exceção do tipo FileNotFoundException caso o 
     * arquivo não seja encontrado.
     * 
     * Esse tipo de exceção está sendo tratada de forma personalizada, ou
     * seja, estamos criando uma exceção que irá gerar mensagens de forma
     * personalizada, com nome personalizado, mensagens etc.
     * 
     * Isso é feito através da criação de uma nova classe, porém ela irá
     * estender da classe Exception. A partir daí tudo que se pode definir
     * em uma classe poderá ser definido nela.
     * 
     * Contudo, o tratamento está sendo feito neste método, este método 
     * está lançando a exceção para ser tratada no método que chamou:
     * 
     * thrwos ImpossivelAberturaDeArquivoException
     */
    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException 
    {
        File file = new File(nomeDoArquivo);
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } 
        /*
         * Se algum problema acontecer durante a leitura ou escrita do 
         * arquivo, este bloco catch será executado, ele trata exceções 
         * do tipo FileNotFoundException, significa que quando o arquivo
         * não for encontrado, cairá neste bloco e uma nova exceção será
         * criada:
         * 
         * throw new ImpossivelAberturaDeArquivoException()
         * 
         * Essa exceção foi criada aqui, porém está sendo lançanda para que
         * o método que chamou para que lá pudesse ser tratado por um bloco
         * catch que será responsável por tratar especificamente desta 
         * exceção que foi criada de forma personalizada.
         */
        catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

/*
 * Esta classe foi criada para tratar de uma exceção específica de forma
 * personalizada. Por se tratar de uma classe, tudo que pode ser definido
 * em uma classe poderá existir nesta. A única recomendação, que é uma boa
 * prática, é ternimar o nome da classe com a palavra 'Exception'.
 * 
 * Obs.: A aplicação de orientação a objetos está sendo aplicado aqui como 
 * herança, por exemplo, usando as palavras extends, super etc.
 */
class ImpossivelAberturaDeArquivoException extends Exception {
    private static final long serialVersionUID = 1L;
    
	private String nomeDoArquivo;
    private String diretorio;

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String diretorio) 
    {
        super("O arquivo " + nomeDoArquivo + " não foi encontrado no diretório " + diretorio);
        this.setNomeDoArquivo(nomeDoArquivo);
        this.setDiretorio(diretorio);
    }

	public String getNomeDoArquivo() {
		return nomeDoArquivo;
	}

	public void setNomeDoArquivo(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}

	public String getDiretorio() {
		return diretorio;
	}

	public void setDiretorio(String diretorio) {
		this.diretorio = diretorio;
	}
}