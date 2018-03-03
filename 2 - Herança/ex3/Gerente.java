package ex3;

public class Gerente extends Funcionario{

	private int matricula;
	private String senha;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	double bonificacao(double bonus) {
		this.salario += bonus;
		System.out.println("salário com bonificação: R$ " + salario);
		return salario;
	}

}
