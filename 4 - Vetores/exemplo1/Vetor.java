package exemplo1;

public class Vetor {

	public static void main(String[] args) {
		// Declarando vetor
		int[] vetor = new int[10];
				
		for(int x = 0;x < vetor.length; x++) {
			vetor[x] = x + 1;
			System.out.println(vetor[x]);
		}
	}
}