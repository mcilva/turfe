package turfe;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);
		
		Narrador.boasVindas();
		
		System.out.println("Informe o nome do hiprodomo: ");
		String nome = c.nextLine();
		System.out.println("E o nome do narrador ?");
		String nomeDoNarrador = c.nextLine();
		System.out.println("Qual é a distancia da corrida: ");
		int distancia = c.nextInt();
		Hipodromo h = new Hipodromo(nome, distancia,nomeDoNarrador);
		
		int opcao = 0;
		do {
			System.out.println("================================/================================");
			System.out.println("Informe sua opcao: ");
			System.out.println("1-Cadastrar competidor\t\t2-Remover competidor\n"
								+ "3-Listar competidores\t\t4-Alterar distancia da corrida\n"
								+ "5-Iniciar Corrida");
			System.out.println("================================/================================");

			opcao = c.nextInt();
			switch(opcao) {
				case 1:
					System.out.println("Informe o nome do Joker:");
					String jokerNome = c.next();
					System.out.println("Informe o nome do cavalo:");
					String nomeCavalo = c.next();
					System.out.println("Informe o numero: ");
					int numero = c.nextInt();
					h.addJoker(jokerNome, nomeCavalo, numero);
				break;
				case 2:
					System.out.println("Estes são os competidores cadastrados:");
					h.listarCompetidores();
					System.out.println("Informe o numero do Joker que deseja remover:");
					int delete = c.nextInt();
					h.removerJoker(delete);
				break;
				case 3:
					h.listarCompetidores();
				break;
				case 4:
					System.out.println("Informe a nova distancia:");
					int novaDistancia = c.nextInt();
					h.setDistancia(novaDistancia);
				break;
				case 5:
					if(h.getCompetidores().size()>=2) {
					boolean iniciou = h.iniciarCorrida();
					if(iniciou)
						Narrador.falarGanhadores(h.getCompetidores());
					}
					else {
						System.out.println("Não foi possivel iniciar a corrida, tente novamente");
						opcao = 0;
					}
				break;

			}
			
		}while(opcao!=5);	
				
				
}
}
