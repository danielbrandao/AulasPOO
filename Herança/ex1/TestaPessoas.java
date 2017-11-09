package ex1;

public class TestaPessoas {

	public static void main(String[] args) {
		// Cria objetos
		Aluno aluno = new Aluno();
		aluno.setNome("Daniel");
		aluno.setIdade(32);
		aluno.setTelefone(988776655);
		aluno.setSexo("Masculino");
		aluno.setMatricula(123456);
		
		aluno.getNome();
		System.out.println("Idade: " + aluno.getIdade());
		System.out.println("Telefone: " + aluno.getTelefone());
		System.out.println("Matricula: " + aluno.getMatricula());
		
		Professor professor = new Professor();
		professor.setEmail("professor@senai.br");
		professor.setDisciplina("POO");
		professor.setSalario(599.0);
		professor.setNome("Daniel");
		
		System.out.println("Disciplina Professor: " + professor.getDisciplina());
		System.out.println("Salário: " + professor.getSalario());
		
		Secretaria secretaria = new Secretaria();
		secretaria.salario = 1000;
		
		
		


		

	}

}
