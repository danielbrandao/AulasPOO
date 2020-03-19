package exercicio7;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionarios funcionario = new Funcionarios();
		funcionario.nome = "Daniel";
		funcionario.matricula = 12;
		funcionario.salario = 2000;
		funcionario.valeRefeicao = 222;
		funcionario.cpf = "77766655522";
		
		System.out.println("Funcionário: " + funcionario.nome);
		System.out.println("Matrícula: " + funcionario.matricula);
		System.out.println("Salário: R$ " + funcionario.salario );
		System.out.println("CPF: " + funcionario.cpf);
		System.out.println("=======================");
		System.out.println("Salário bruto: R$ " + funcionario.salarioBruto());
	}

}
