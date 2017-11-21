package exemplo1;

import java.io.InputStream;
import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream entrada = System.in;
		Scanner scanner = new Scanner(entrada);
		System.out.println("Digite um texto: ");
		
		while(scanner.hasNextLine()) {
			String linha = scanner.nextLine();
			System.out.println(linha);
			System.out.println("Digite outro texto: ");				

		}

	}

}
