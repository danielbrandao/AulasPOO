package exemplo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LendoString {

	// throws é um tratamento de Exceções
	public static void main(String[] args)  throws IOException{
		InputStream is = System.in;
		System.out.print("Digite um texto: ");
		
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		String digitado = br.readLine();

		while(digitado != null){
			System.out.println("Texto Digitado = "+digitado);
			digitado = br.readLine();
		}

       }
}