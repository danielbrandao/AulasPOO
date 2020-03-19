package exercicio5;

public class TesteAluno {

	public static void main(String[] args) {
		// Criando objeto aluno1
		Aluno aluno1 = new Aluno();
		aluno1.nome = "João";
		aluno1.matricula = 123456670;
		aluno1.cpf = "123456789-00";
		aluno1.email = "joao@meuemail.com";
		
		System.out.println("Aluno: " + aluno1.nome);
		System.out.println("Matrícula: " + aluno1.matricula);
		System.out.println("CPF: " + aluno1.cpf);
		System.out.println("E-mail: " + aluno1.email);

		System.out.println("============================");
		// Criando objeto aluno2
		Aluno aluno2 = new Aluno();
		aluno2.nome = "José";
		aluno2.matricula = 98765432;
		aluno2.cpf = "88776655-99";
		aluno2.email = "josé@hotmail.com";
		
		System.out.println("Aluno: " + aluno2.nome);
		System.out.println("Matrícula: " + aluno2.matricula);
		System.out.println("CPF: " + aluno2.cpf);
		System.out.println("E-mail: " + aluno2.email);
	}

}
