/*
Sistema de loca��o de ve�culos
Classe: Veiculo
Descri��o: lashdkjhkdhal
*/
package exercicio3;

public abstract class Veiculo {
	String modelo;
	String marca;
	int ano;
	double preco_loca;
	int dias_loca;
	
	// m�todo abstrato
	public abstract double calculaLocacao(); 
		
}