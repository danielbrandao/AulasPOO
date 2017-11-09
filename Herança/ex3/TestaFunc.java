package ex3;

public class TestaFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente gerente = new Gerente();
		
		gerente.setNome("Daniel");
		gerente.setSalario(3000);
		gerente.setCpf(123456789);
		gerente.getNome();
		gerente.getCpf();
		gerente.getSalario();
		gerente.bonificacao(100);
		
		Supervisor supervisor = new Supervisor();
		supervisor.setNome("José");
		supervisor.setSalario(2000);
		supervisor.setCpf(999887776);
		supervisor.getNome();
		supervisor.getCpf();
		supervisor.getSalario();
		supervisor.bonificacao(50);
		supervisor.calculaHE(5,20);
			
		
	}

}
