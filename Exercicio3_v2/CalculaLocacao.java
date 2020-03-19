package exercicio3;

public class CalculaLocacao {

	public static void main(String[] args) {
		// Criando objeto
		Passeio carro = new Passeio();
		Utilitario picape = new Utilitario();
		
		carro.modelo = "Uno";
		carro.marca = "Fiat";
		carro.ano = 2014;
		carro.dias_loca = 5;
		carro.preco_loca = 100;
		
		System.out.println
		("Carro = " + carro.marca + " " + carro.modelo);
		System.out.println("Ano = " + carro.ano);
		System.out.println
		("Valor de locação = R$ " + carro.calculaLocacao());	
	}
}
