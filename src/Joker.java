package turfe;


public class Joker{
	private Cadastro jokerDados;
	Cavalo c ;
	private double tempo;
	public static final int primeiro = 0;
	public static final int segundo	 = 1;
	public static final int terceiro = 2;
	private int podios[] = {0,0,0};
	
	//Constructor
	public Joker(String nomeDoJoker,String nomeDoCavalo, int numero){
		jokerDados = new Cadastro(nomeDoJoker, numero);
		c = new Cavalo(nomeDoCavalo, numero);
		
	}
	public Joker(String nomeDoJoker,String nomeDoCavalo, int numero,int emPrimeiro, int emSegundo, int emTerceiro){
		jokerDados = new Cadastro(nomeDoJoker, numero);
		c = new Cavalo(nomeDoCavalo, numero);
		setPodios(emPrimeiro, emSegundo,emTerceiro);
	}
	public void disputarCorrida(double velocidade, int distancia) {
		this.c.correr(velocidade);
		this.tempo = (double)(distancia/this.c.getVelocidade());

	}
	
	public String getNomeDoJoker() {
		return jokerDados.getNome();
	}

	public int getNumeroDoJoker() {
		return jokerDados.getNumero();
	}
	public double getTempo() {
		return tempo;
	}
	public void setPodios(int emPrimeiro, int emSegundo, int emTerceiro) {
		this.podios[primeiro] = emPrimeiro;
		this.podios[segundo]  = emSegundo;
		this.podios[terceiro] = emTerceiro;
			
	}
	
	public int getPodioEmPrimeiro() {
		return podios[primeiro];
	}
	public int getPodioEmSegundo() {
		return podios[segundo];
	}
	public int getPodioEmTerceiro() {
		return podios[terceiro];
	}
	public void ganhouEmPrimeiro() {
		 this.podios[primeiro]+=1;
	}
	public void ganhouEmSegundo() {
		this.podios[segundo]+=1;
	}
	public void ganhouEmTerceiro() {
		this.podios[terceiro]+=1;
	}



	
	
}
