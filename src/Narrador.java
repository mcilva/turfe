package turfe;

import java.util.ArrayList;

public abstract class Narrador {
	private static String nome;
	
	public Narrador(String nome){
		Narrador.nome = nome;
	}
	
	public static void boasVindas() {
		System.out.println("Bem vindo ao mini-simulador de turfe, vamos começar ?");
	}
	public static void apresentar(ArrayList <Joker> competidores, Hipodromo h) {
		System.out.println("Ola eu sou o "+Narrador.nome);
		System.out.println("Seja bem Vindo ao "+h.getNome()+" onde ocorrerá mais uma corrida");
		System.out.println("Hoje temos os seguintes corredores: ");
		for(int i=0; i<competidores.size(); i++) {
			System.out.println(competidores.get(i).getNomeDoJoker()+" montando o cavalo "+competidores.get(i).c.getNomeDoCavalo()+" e seu número é o "+competidores.get(i).getNumeroDoJoker());
		}
		
		System.out.println("Eai já fez suas apostas ?");
		
	}

	public static void falarGanhadores(ArrayList<Joker> competidores) {
		System.out.println("Foi encerrada mais uma corrida sensacional e acirrada");
		System.out.println("O Joker "+competidores.get(0).getNomeDoJoker()+" montando o cavalo "+competidores.get(0).c.getNomeDoCavalo()+" ganhou em primeiro lugar a corrida");
		System.out.println("Logo em seguida temos o "+competidores.get(1).getNomeDoJoker()+" com o seu cavalo "+competidores.get(1).c.getNomeDoCavalo()+" ficando com a segunda posição");
		System.out.println("E o terceiro colocado foi o "+competidores.get(2).getNomeDoJoker()+" montando o cavalo "+competidores.get(2).c.getNomeDoCavalo()+" numero "+competidores.get(2).getNumeroDoJoker());
	}

	public static void setNome(String nomeDoNarrador) {
		Narrador.nome = nomeDoNarrador;
		
	}
}
