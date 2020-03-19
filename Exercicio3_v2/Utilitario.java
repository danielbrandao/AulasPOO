package exercicio3;

public class Utilitario extends Veiculo {

	@Override
	public double calculaLocacao() {
	  double total = (preco_loca * dias_loca)+40;
	  return total;
	}

}
