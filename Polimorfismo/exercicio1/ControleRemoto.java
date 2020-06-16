package exercicio1;

public class ControleRemoto {
	
	private Brinquedo brinquedo;
	
	public ControleRemoto(Brinquedo novobrinquedo){
		this.brinquedo = novobrinquedo;
	}
	
	public void acao() {
		this.brinquedo.mover();
	}
}