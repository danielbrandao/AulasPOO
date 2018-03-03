package ex1;

public class Conta {
	
	private double saldo;
	
	// Método calcula depósito
	void deposita(double valor) {
		this.saldo += valor;
		this.descontaTarifa();
		System.out.println(saldo);
	}
	//Método calcula saque
	void saca(double valor) {
		this.saldo -= valor;
		this.descontaTarifa();
		System.out.println(saldo);
	}
	// Método desconta tarifa
	private void descontaTarifa() {
		this.saldo -= 1;
	}
}
