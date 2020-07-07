package exercicio5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Financiamento {

	public static void main(String[] args) throws FileNotFoundException {
		// Declaração de variáveis
		double valorVeiculo;
		int parcelas;
		double valorParcela;
		double parcelaJuros;
		double valorTotal;
		int codCliente = 1;
		
		InputStream entrada = System.in;
		Scanner scanner = new Scanner(entrada);
		
		OutputStream arquivo = new FileOutputStream ("src/exercicio5/financiamento.txt");
		PrintStream printStreamArquivo = new PrintStream (arquivo);
	
		System.out.println("Valor do veículo: ");
		valorVeiculo = scanner.nextDouble();
		
		System.out.println("Quantidade de parcelas:  ");
		parcelas = scanner.nextInt();
		
		valorParcela = (valorVeiculo / parcelas);
		parcelaJuros = valorParcela + (valorParcela*1)/100;
		valorTotal = parcelaJuros * parcelas;
		
		printStreamArquivo.print("Valor a vista: R$ " + valorVeiculo + "\n");
		System.out.println("Valor a vista: R$ " + valorVeiculo);

		printStreamArquivo.print("Valor das parcelas: R$ " + Math.floor(parcelaJuros)+ "\n");
		System.out.println("Valor das parcelas: R$ " + Math.floor(parcelaJuros));
		
		printStreamArquivo.print("Valor total do veículo: R$ " + valorTotal + "\n");
		System.out.println("Valor Total do veículo: R$ " + Math.floor(valorTotal));

	}

}
