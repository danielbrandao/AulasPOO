package ex3;

public class Supervisor extends Funcionario {

	private String setor;
	double novoSal;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public double calculaHE(double hora, double valorHora) {
		this.novoSal = salario+(hora * valorHora);
		System.out.println(novoSal);
		return novoSal;
	}

	@Override
	double bonificacao(double bonus) {
		this.salario += bonus;
		System.out.println("Salário com bonificação: R$ " + salario);
		return salario;
	}
	
	
	

}
