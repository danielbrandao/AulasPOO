package exercicio7;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionarios funcionario = new Funcionarios();
		funcionario.nome = "Daniel";
		funcionario.matricula = 12;
		funcionario.salario = 2000;
		funcionario.valeRefeicao = 222;
		funcionario.cpf = "77766655522";
		
		System.out.println("Funcion�rio: " + funcionario.nome);
		System.out.println("Matr�cula: " + funcionario.matricula);
		System.out.println("Sal�rio: R$ " + funcionario.salario );
		System.out.println("CPF: " + funcionario.cpf);
		System.out.println("=======================");
		System.out.println("Sal�rio bruto: R$ " + funcionario.salarioBruto());
	}

}
