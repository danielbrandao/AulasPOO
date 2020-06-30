package exercicio1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) throws FileNotFoundException {
		// Declarando arquivo que salvará o texto
		 OutputStream arquivo = new FileOutputStream ("src/exercicio1/meuArquivo.txt");
		 PrintStream printStreamArquivo = new PrintStream (arquivo);
		 
		 // Declarando objeto que dará entrada nos dados
		 InputStream entrada = System.in;
		 Scanner scanner = new Scanner(entrada);
		 
		 System.out.println("Digite uma frase: ");
		 printStreamArquivo.println(scanner.nextLine());
		 
		 System.out.println("Arquivo salvo com sucesso. \n");

	}

}
