package exercicio7;

public class Supervisor extends Funcionario {

	private String setor;
	private String especialidade;
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	@Override
	public double bonificacao() {
		double bonus = 50;
		return bonus;
	}
	
	
	
}
