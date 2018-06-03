package turfe;

public class Cavalo {
	private Cadastro horseDados;
	private double velocidade;
	
	//Constructor
	public Cavalo(String nome, int numero) {
		this.horseDados = new Cadastro(nome,numero);
	}
	
	public String getNomeDoCavalo() {
		return this.horseDados.getNome();
	}
	public int getNumeroDoCavalo() {
		return this.horseDados.getNumero();
	}
	public void correr(double v) {
		this.velocidade = v;
	}
	public double getVelocidade() {
		return velocidade;
	}
	

}
