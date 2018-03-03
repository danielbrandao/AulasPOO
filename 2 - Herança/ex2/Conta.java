package ex2;

abstract class Conta {
	
	protected int numero;
	protected String cliente;
	protected int dataAbertura;
	protected double saldo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(int dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	void exibirMensagem() {
		System.out.println("Olá cliente " + cliente + ". Bem-vindo a sua conta!");
	}
	
	abstract double debitar(double saque);
	

}
