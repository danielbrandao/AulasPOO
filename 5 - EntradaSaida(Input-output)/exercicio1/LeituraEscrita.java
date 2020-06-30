package exercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class LeituraEscrita {

	public static void main(String[] args) throws IOException {
	
		FileReader arquivo = new FileReader("src/exercicio1/meuArquivo.txt");
		BufferedReader leitura = new BufferedReader(arquivo);
		String s;
		
		System.out.println("Arquivo aberto com sucesso.");

		//ENQUANTO EXISTE DADOS CONTINUA IMPRIMINDO
		while ((s = leitura.readLine()) != null) {
			System.out.println(s);
		}
		leitura.close();
	}
}
