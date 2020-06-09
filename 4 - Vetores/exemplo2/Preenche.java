package exemplo2;

import java.util.Arrays;

public class Preenche {

	public static void main(String[] args) {
		// Criando objeto do tipo vetor
		int[] numeros = new int[10];
		Arrays.fill(numeros, 5);
		
		for(int i = 0; i < 10;i++) {
			System.out.println(numeros[i]);
		}
	}
}
