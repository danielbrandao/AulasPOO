package exemplo1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class EntradaTxt {

	// throws é um tratamento de Exceções
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("file.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		
		//ENQUANTO EXISTE DADOS CONTINUA IMPRIMINDO
		while ((s = br.readLine()) != null) {
			System.out.println(s);

		}
	}
}