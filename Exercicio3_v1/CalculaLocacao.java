package exercicio3;

public class CalculaLocacao {

	public static void main(String[] args) {
		Veiculos uno = new Veiculos();
		uno.ano = 1995;
		uno.marca = "Fiat";
		uno.modelo = "passeio";
		uno.quantDias = 7;
		uno.valorLocacao = 100;
		
		System.out.println(uno.passeio(uno.quantDias, uno.valorLocacao));
		
		
	}

}