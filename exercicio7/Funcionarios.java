package exercicio7;

public class Funcionarios {
	String nome;
	int matricula;
	String cpf;
	double salario;
	double valeRefeicao;
	
	public double salarioBruto() {
		double total = salario + valeRefeicao;
		return total;
	}
	
}