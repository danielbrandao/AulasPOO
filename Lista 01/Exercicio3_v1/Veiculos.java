package exercicio3;

public class Veiculos {
	String modelo;
	String marca;
	int ano;
	double valorLocacao;
	int quantDias;
	
	public double passeio(int quantDias,double valorLocacao){
		double total = quantDias * (valorLocacao-20);
		return total;
	}
	
	public double util(int quantDias,double valorLocacao) {
		double total = quantDias * (valorLocacao+40);
		return total;
	}

}
