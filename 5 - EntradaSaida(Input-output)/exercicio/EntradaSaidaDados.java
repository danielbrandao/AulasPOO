package exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EntradaSaidaDados {
	
	public static void main(String args[]) {

		File f = new File("ArquivoTexto.txt");

		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Texto inserido no arquivo.");
			
			//INSERE UMA NOVA LINHA
			bw.newLine();
			bw.write("Continua sendo inserido em uma nova linha");
			bw.newLine();
			
			bw.write("Continua sendo inserido em uma 3ª linha");
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//EFETUANDO A LEITURA
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s;
			
			//ENQUANTO EXISTE DADOS CONTINUA IMPRIMINDO
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Erro: "+e.getMessage());
			e.printStackTrace();
		}
	}
}
