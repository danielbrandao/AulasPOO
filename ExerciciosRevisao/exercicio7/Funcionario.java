package exercicio7;

public abstract class Funcionario {
		
		private String nome;
		private int matricula;
		private String rg;
		private String cpf;
		private String funcao;

		public void getInfo() {
			System.out.println("Funcionário: "+ this.nome);
			System.out.println("Matrícula: "+ this.matricula);
			System.out.println("RG: " + this.rg);
		}
		
		public abstract double bonificacao();
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		
	
		public String getRg() {
			return rg;
		}
		public void setRg(String rg) {
			this.rg = rg;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getFuncao() {
			return funcao;
		}
		public void setFuncao(String funcao) {
			this.funcao = funcao;
		}
		
}