package exercicio7;

public class Gerente extends Funcionario {

	private String usuario;
	private String senha;
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public double bonificacao() {
		double bonus = 100;
		return bonus;
	}

}
