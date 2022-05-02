import java.util.Random;

public class RPG {
	public static void main(String[] args) {
		Mago gandalf = new Mago("Gandalf", 60, 18, 8);
		Guerreiro thor = new Guerreiro("Thor", 80, 8, 18);
		
		gandalf.apresentar();
		thor.apresentar();
		System.out.println("");
		
		thor.aprenderHabilidade("Soco");
		thor.aprenderHabilidade("Chute");
		thor.aprenderHabilidade("Cotovelada");
		
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
				thor.setVida(thor.getVida() - gandalf.getMagia());
				if(thor.getVida() <= 0) {
					break;
				}
				thor.attack();
				gandalf.setVida(gandalf.getVida() - thor.getHabilidade());
			} else {
				System.out.println("O Guerreiro ataca primeiro!");
				thor.attack();
				gandalf.setVida(gandalf.getVida() - thor.getHabilidade());
				if(gandalf.getVida() <= 0) {
					break;
				}
				gandalf.attack();
				thor.setVida(thor.getVida() - gandalf.getMagia());
			}
			System.out.println("Vida do " + gandalf.getNome() + " : " +
								gandalf.getVida());
			System.out.println("Vida do " + thor.getNome() + " : " + 
								thor.getVida());
			System.out.println("");
		} while (gandalf.getVida() > 0 && thor.getVida() > 0);
				System.out.println("Vida do " + gandalf.getNome() + " : " +
									gandalf.getVida());
				System.out.println("Vida do " + thor.getNome() + " : " + 
									thor.getVida());	
		
		System.out.println("====================================");
		System.out.println("Fim da luta!!");
		
		if(gandalf.getVida() > 0) {
			System.out.println("O MAGO É O VENCEDOR!!");
		}else if (thor.getVida() > 0) {
			System.out.println("O GUERREIRO É O VENCEDOR!!");
		}
		
		
		

	}

}
