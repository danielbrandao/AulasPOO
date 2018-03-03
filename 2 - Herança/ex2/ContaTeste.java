package ex2;

public class ContaTeste {

	public static void main(String[] args) {
		// Objeto conta
		ContaCorrente cc = new ContaCorrente();
		cc.setCliente("Daniel");
		cc.setDataAbertura(22102017);
		cc.setNumero(012233);
		cc.setSaldo(1000);
		cc.setTaxaOperacao(1);
		cc.exibirMensagem();
		
		cc.debitar(100.00);
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setCliente("Daniel");
		cp.setDataAbertura(22102017);
		cp.setNumero(012233);
		cp.setSaldo(1000);
		cp.debitar(50);
	}
}
