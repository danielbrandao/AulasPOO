package sisbanco;

public class ContaPoupanca extends Conta{
	private double taxaRendimento = 10;

	protected double getTaxaRendimento() {
		return taxaRendimento;
	}

	protected void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	double debitar(double valor) {
		return saldo -= valor;
	}

	@Override
	double creditar(double valor) {
		return saldo += valor;
	}
	
	double creditarRendimento() {
		return saldo += getTaxaRendimento();
	}
	
}