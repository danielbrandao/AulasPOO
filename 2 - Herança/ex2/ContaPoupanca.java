package ex2;

public class ContaPoupanca extends Conta {
	
	private double taxaRendimento;

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	@Override
	double debitar(double saque) {
		this.saldo -= saque;
		System.out.println(saldo);
		return saldo;
	}
}
