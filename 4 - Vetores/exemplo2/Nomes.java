package exemplo2;

import java.util.Arrays;

public class Nomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nomes = new String[] {"Ziraldo","Daniel","Antonio"}; 
		String[] nomesduplicados = Arrays.copyOf(nomes,5);
		
		nomesduplicados[3] = "Francisco";
		nomesduplicados[4] = "Bruno";
		
		Arrays.sort(nomesduplicados);
		
		for( String nome : nomesduplicados) {
			System.out.println(nome);
		}
	}
}
