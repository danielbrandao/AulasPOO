package exercicio4;

import java.io.InputStream;
import java.util.Scanner;

public class TestaIdade {

	public static void main(String[] args) {
		// Criando variáveis
		String nome1;
		String nome2;
		int idade1;
		int idade2;
		
		// Declarando objetos de entrada
		InputStream entrada = System.in;
		Scanner scanner = new Scanner(entrada);
		Scanner scanner2 = new Scanner(entrada);

		System.out.println("Digite o primeiro nome: ");
		nome1 = scanner.nextLine();
		
		System.out.println("Digite a idade de "+ nome1);
		idade1 = scanner.nextInt();
		
		System.out.println("Digite o segundo nome: ");
		nome2 = scanner2.nextLine();
		
		System.out.println("Digite a idade dele(a) ");
		idade2 = scanner.nextInt();
		
			
		if(idade1 > idade2){
			System.out.println(nome1 + " é mais velho.");
		}else {
			if(idade2 > idade1) {
				System.out.println(nome2 + " é mais velho.");
			}else {
				System.out.println("Ambos tem a mesma idade.");
			}
		}

	}

}
