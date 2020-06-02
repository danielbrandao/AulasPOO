package sisbanco;

public class ContaCorrente extends Conta {
	private double taxaOperacao = 1;
	private double taxaManutencao = 10;
	
	protected double getTaxaOperacao() {
		return taxaOperacao;
	}
	protected void setTaxaOperacao(double taxaOperacao) {
		this.taxaOperacao = taxaOperacao;
	}
	protected double getTaxaManutencao() {
		return taxaManutencao;
	}
	protected void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
	@Override
	double debitar(double valor) {
		return saldo -= (valor+taxaOperacao);
	}
	@Override
	double creditar(double valor) {
		return saldo += (valor)-taxaOperacao;
	}
	double debitarManutencao() {
		return saldo -= taxaManutencao;
	}

}
