package turfe;

public class Cadastro {

	private String nome;
	private int numero;
	
	//Construct
	public Cadastro(String nome, int numero){
		this.nome = nome;
		this.numero = numero;
	}
	
	//Metodos Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
