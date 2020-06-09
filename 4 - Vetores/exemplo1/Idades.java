package exemplo1;

public class Idades {

	public static void main(String[] args) {
		// Criar objeto do tipo vetor
		int[] idades = new int[10];
		idades[0] = 10;
		idades[1] = 12;
		
		for(int i = 0; i < 10; i++) {
			idades[i] = i * 2;
			System.out.println(idades[i]);
		}

	}

}
