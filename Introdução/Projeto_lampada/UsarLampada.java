
public class UsarLampada {
	
	public static void main(String[] args) {
		// Declarando objeto "encandecente"
		Lampada encandecente = new Lampada();
		encandecente.acende();
		encandecente.mostraEstado();
		
		// Declarando objeto "fluorescente"
		Lampada fluorescente = new Lampada();
		fluorescente.apaga();
		fluorescente.mostraEstado();
		
		// Declarando objeto "Led"
		Lampada led = new Lampada();
		led.apaga();
		led.mostraEstado();
	}

}
