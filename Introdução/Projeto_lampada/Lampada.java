public class Lampada {
	// Declara��o do atributo
	String EstadoDaLampada;
	
	// Declara��o dos m�todos
	public void acende() {
		EstadoDaLampada = "Acesa";
	}
	
	public void apaga() {
		EstadoDaLampada = "Apagada";
	}
	
	public void mostraEstado() {
		System.out.println(EstadoDaLampada);
	}
	
}
