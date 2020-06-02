package sisbanco;

public abstract class Conta {
	private int numero;
	private String cliente;
	private String dataAbertura;
	protected double saldo;
	
	protected int getNumero() {
		return numero;
	}
	protected void setNumero(int numero) {
		this.numero = numero;
	}
	protected String getCliente() {
		return cliente;
	}
	protected void setCliente(String cliente) {
		this.cliente = cliente;
	}
	protected String getDataAbertura() {
		return dataAbertura;
	}
	protected void setDataAbertura(String dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	protected double getSaldo() {
		return saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void exibirMensagem() {
		System.out.println(getCliente() + " , Bem-vindo a sua Conta bancária!");
	}
	
	abstract double debitar(double valor);
	
	abstract double creditar(double valor);
	
}
