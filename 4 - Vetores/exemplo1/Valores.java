package exemplo1;

public class Valores {

	public static void main(String[] args) {
		// Criar objeto valores do tipo vetor
		int[] valores = new int[20];
		
		for(int x = 0; x < 20; x += 2) {
			valores[x] = x + 2;
			System.out.println(valores[x]);
		}

	}

}
