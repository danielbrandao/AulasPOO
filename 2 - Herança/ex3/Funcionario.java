package ex3;

public abstract class Funcionario {
	
	private String nome;
	protected double salario;
	private int cpf;
	
	public String getNome() {
		System.out.println("Funcionario: " + nome);
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		System.out.println("Salário: " + salario);
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	abstract double bonificacao(double bonus);

}
