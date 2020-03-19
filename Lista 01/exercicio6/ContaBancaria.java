package exercicio6;

public class ContaBancaria {

	public static void main(String[] args) {
		// Criando objeto cliente1
		Cliente cliente1 = new Cliente();
		cliente1.nome = "José";
		cliente1.rg = 98765432;
		cliente1.cpf = "88776655-99";
		cliente1.telefone = "98888-8877";
		cliente1.numconta = 123455;
		
		System.out.println("Cliente: "+ cliente1.nome);
		System.out.println("Número da conta: "+ cliente1.numconta);
		System.out.println("CPF: "+ cliente1.cpf);
		System.out.println("RG: "+ cliente1.rg);
		System.out.println("Telecone: "+ cliente1.telefone);

	}

}
