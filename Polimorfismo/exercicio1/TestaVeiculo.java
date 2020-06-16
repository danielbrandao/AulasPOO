package exercicio1;

public class TestaVeiculo {
	public static void main(String args[]) {
		
		Carro carro = new Carro();
		
		Aviao aviao = new Aviao();
		
		Navio navio = new Navio();

		ControleRemoto controle = new ControleRemoto(navio);
		ControleRemoto controle2 = new ControleRemoto(aviao);
		ControleRemoto controle3 = new ControleRemoto(carro);
		controle.acao();
		controle2.acao();
		controle3.acao();
		
	}
}