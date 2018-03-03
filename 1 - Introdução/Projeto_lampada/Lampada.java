public class Lampada {
	// Declaração do atributo
	String EstadoDaLampada;
	
	// Declaração dos métodos
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
