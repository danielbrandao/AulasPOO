package exercicio3;

public class Passeio extends Veiculo {

	@Override
	public double calculaLocacao(){
	  double total = (preco_loca * dias_loca)-20;
	  return total;
	}
	

}
