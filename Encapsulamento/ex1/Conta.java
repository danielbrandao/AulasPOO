package ex1;

public class Conta {
	
	private double saldo;
	
	// M�todo calcula dep�sito
	void deposita(double valor) {
		this.saldo += valor;
		this.descontaTarifa();
		System.out.println(saldo);
	}
	//M�todo calcula saque
	void saca(double valor) {
		this.saldo -= valor;
		this.descontaTarifa();
		System.out.println(saldo);
	}
	// M�todo desconta tarifa
	private void descontaTarifa() {
		this.saldo -= 1;
	}
}
