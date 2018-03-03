package ex2;

public class ContaCorrente extends Conta {

	private double taxaOperacao;
	private double taxaManutencao;
	
	public double getTaxaOperacao() {
		return taxaOperacao;
	}
	public void setTaxaOperacao(double taxaOperacao) {
		this.taxaOperacao = taxaOperacao;
	}
	public double getTaxaManutencao() {
		return taxaManutencao;
	}
	public void setTaxaManutencao(double taxaManutencao) {
		this.taxaManutencao = taxaManutencao;
	}
		
	@Override
	double debitar(double saque) {
		this.saldo = (saldo - saque) - taxaOperacao;
		System.out.println(saldo);
		return saldo;
	}
	
	
}
