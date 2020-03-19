package exercicio2;

public class CalculaIdade {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(); 
		pessoa.idade = 15;
		pessoa.nome = "José";
		pessoa.sexo = "masculino";
		System.out.println(pessoa.nome);
		pessoa.maiorDeIdade(pessoa.idade);
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.idade = 24;
		pessoa2.sexo = "feminino";
		pessoa2.nome = "Jéssica";
		pessoa2.maiorDeIdade(pessoa2.idade);
	}

}
