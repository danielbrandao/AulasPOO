package sisbanco;

public class ContaTeste {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.setCliente("Daniel");
		conta.setNumero(123456);
		conta.setDataAbertura("28/02/2020");
		conta.setSaldo(500.00);
		conta.setTaxaOperacao(0);
		conta.debitar(50);
		conta.creditar(10);
		
		conta.exibirMensagem();
		System.out.println("Saldo da conta corrente: R$ " + conta.getSaldo());
		
		ContaPoupanca poupa = new ContaPoupanca();
		poupa.getCliente();
		poupa.setCliente("José");
		poupa.setNumero(54321);
		poupa.setDataAbertura("25/01/2020");
		poupa.setSaldo(5000.00);

		poupa.debitar(50);
		poupa.creditar(10);
		poupa.exibirMensagem();
		System.out.println("Saldo da conta poupanca: R$ " + poupa.getSaldo());
		
		
	}

}
