
public class UsarCelular {

	public static void main(String[] args) {
		// Criando os objetos
		Celular celular1 = new Celular();
		celular1.cor = "Preto";
		celular1.altura = "5 polegadas";
		celular1.largura = 3.5;
		celular1.peso = 200;
		celular1.tecnologia = "4G";
		
		celular1.ligar();
		 
		System.out.println("Dados do celular:");
		System.out.println("Cor: " + celular1.cor );
		System.out.println("Altura: " + celular1.altura );
		System.out.println("Peso: " + celular1.peso );
		System.out.println("Tecnologia: " + celular1.tecnologia );
		
		celular1.radio();
		celular1.baterFoto();
		celular1.desligar();
		
	}

}