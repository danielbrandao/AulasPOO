package exercicio7;

public class RelatorioFuncionarios {

	public static void main(String[] args) {
		// Criando objetos
		Gerente ger = new Gerente();
		ger.setMatricula(1000);
		ger.setNome("Daniel");
		ger.setRg("200000");
		
		ger.getInfo();
		System.out.println("===================");
		
		Supervisor supervis = new Supervisor();
		supervis.setMatricula(2000);
		supervis.setNome("João");
		supervis.setRg("1232321321");
		
		supervis.getInfo();
		System.out.println("===================");

	}

}
