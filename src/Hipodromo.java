package turfe;

import java.util.ArrayList;
//import java.util.Random;
import java.util.Collections;

public class Hipodromo {
	
	private int distancia;
	private String nome;
	private ArrayList<Joker> competidores = new ArrayList<Joker>();

	
	public Hipodromo(String nome, int distancia,String nomeDoNarrador){
		this.nome = nome;
		this.distancia = distancia;
		Narrador.setNome(nomeDoNarrador);
	}
	public boolean addJoker(String jokerNome, String cavaloNome, int numero) {
		for(int i=0; i<this.competidores.size(); i++) {
			if(this.competidores.get(i).getNumeroDoJoker() == numero) {
				System.out.println("Já existe um joker com este número, tente novamente!");
				return false;
			}
		}
		this.competidores.add(new Joker(jokerNome,cavaloNome,numero));
		System.out.println("Competidor adicionado com sucesso!");
		return true;
		}
	
	public boolean removerJoker(int i) {
		for(int j=0; j<this.competidores.size(); j++) {
			if(this.competidores.get(j).getNumeroDoJoker() == i) {
				this.competidores.remove(j);
				System.out.println("Competidor removido com sucesso!");
				return true;
			}
		}
		System.out.println("Não existe competidor com o numero informado, tente novamente");
		return false;
	}	


	public boolean iniciarCorrida() {
		if(this.competidores.size()!=0) {
		Narrador.apresentar(this.competidores, this);
		for(int i=0; i<this.competidores.size(); i++) {
				double velocidade = (double) Math.ceil(Math.random() * (70 - 60 + 1)) - 1 + 60;
				this.competidores.get(i).disputarCorrida(velocidade, this.distancia);
			
			}
		Collections.sort(this.competidores, new Colocacao());
		this.competidores.get(0).ganhouEmPrimeiro();
		this.competidores.get(1).ganhouEmSegundo();
		this.competidores.get(2).ganhouEmTerceiro();
		return true;
		}else {
		System.out.println("Não há corredores, voce deve cadastra-los");
		return false;
		}
	}
	public boolean listarCompetidores() {
		if(this.competidores.size()==0) {
			System.out.println("Não há competidores cadastrados!");
			return false;
		}
		for(int i=0; i<this.competidores.size(); i++) {
			System.out.println(this.competidores.get(i).getNomeDoJoker()+" "+this.competidores.get(i).getNumeroDoJoker());
		}
		return true;
	}

	public void ganhadores() {
		Narrador.falarGanhadores(this.competidores);
	}
	public ArrayList<Joker> getCompetidores() {
		return this.competidores;
	}
	public String getNome() {
		return this.nome;
	}
	public void setDistancia(int d) {
		this.distancia = d;
	}
	public int getDistancia() {
		return distancia;
	}

}
