package exercicio6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Cadastramento {

	public static void main(String[] args) throws FileNotFoundException {
		// Criando objetos
		Detran cadastro = new Detran();
		InputStream entrada = System.in;
		Scanner scanner = new Scanner(entrada);

		OutputStream arquivo = new FileOutputStream ("src/exercicio6/detran.txt");
		PrintStream printStreamArquivo = new PrintStream (arquivo);
	
		System.out.println("+++ Cadastro de veículo ++ DETRAN/PB");
		
		System.out.println("Marca: ");
		cadastro.setMarca(scanner.nextLine());
		printStreamArquivo.print("Marca: " + cadastro.getMarca() +"\n");
		
		System.out.println("Modelo: ");
		cadastro.setModelo(scanner.nextLine());
		printStreamArquivo.print("Modelo: " + cadastro.getModelo() +"\n");

		System.out.println("Categoria: ");
		cadastro.setCategoria(scanner.nextLine());
		printStreamArquivo.print("Categoria: " + cadastro.getCategoria() +"\n");
		
		System.out.println("Placa: ");
		cadastro.setPlaca(scanner.nextLine());
		printStreamArquivo.print("Placa: " + cadastro.getPlaca() +"\n");
		
		System.out.println("Chassi: ");
		cadastro.setChassi(scanner.nextLine());
		printStreamArquivo.print("Chassi: " + cadastro.getChassi() +"\n");
		
		// CONTINUA DEMAIS ATRIBUTOS

	}

}
