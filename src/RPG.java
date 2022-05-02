import java.util.Random;

public class RPG {
	public static void main(String[] args) {
		Mago gandalf = new Mago("Gandalf", 60, 18, 8);
		Guerreiro mike = new Guerreiro("Thor", 80, 8, 18);
		
		gandalf.apresentar();
		mike.apresentar();
		System.out.println("");
		
		mike.aprenderHabilidade("Soco");
		mike.aprenderHabilidade("Chute");
		mike.aprenderHabilidade("Cotovelada");
		
		gandalf.aprenderMagia("Bola de fogo");
		gandalf.aprenderMagia("Chuva ácida");
		gandalf.aprenderMagia("Raios elétricos");
		
		Random random = new Random();
		int r = random.nextInt(2);
		
		System.out.println("=========== LUTA ===========");
		System.out.println("Começou a luta!!");
		do {
			if (r == 0) {
				System.out.println("O Mago ataca primeiro!");
				gandalf.attack();
				mike.setVida(mike.getVida() - gandalf.getMagia());
				if(mike.getVida() <= 0) {
					break;
				}
				mike.attack();
				gandalf.setVida(gandalf.getVida() - mike.getHabilidade());
			} else {
				System.out.println("O Guerreiro ataca primeiro!");
				mike.attack();
				gandalf.setVida(gandalf.getVida() - mike.getHabilidade());
				if(gandalf.getVida() <= 0) {
					break;
				}
				gandalf.attack();
				mike.setVida(mike.getVida() - gandalf.getMagia());
			}
			System.out.println("Vida do " + gandalf.getNome() + " : " +
								gandalf.getVida());
			System.out.println("Vida do " + mike.getNome() + " : " + 
								mike.getVida());
			System.out.println("");
		} while (gandalf.getVida() > 0 && mike.getVida() > 0);
				System.out.println("Vida do " + gandalf.getNome() + " : " +
									gandalf.getVida());
				System.out.println("Vida do " + mike.getNome() + " : " + 
									mike.getVida());	
		
		System.out.println("====================================");
		System.out.println("Fim da luta!!");
		
		if(gandalf.getVida() > 0) {
			System.out.println("O MAGO É O MAGO É O VENCEDOR!!");
		}else if (mike.getVida() > 0) {
			System.out.println("O GUERREIRO É O VENCEDOR!!");
		}
		
		
		

	}

}
