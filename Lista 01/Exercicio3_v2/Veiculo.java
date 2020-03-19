/*
Sistema de locação de veículos
Classe: Veiculo
Descrição: lashdkjhkdhal
*/
package exercicio3;

public abstract class Veiculo {
	String modelo;
	String marca;
	int ano;
	double preco_loca;
	int dias_loca;
	
	// método abstrato
	public abstract double calculaLocacao(); 
		
}