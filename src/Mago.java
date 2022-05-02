import java.util.ArrayList;
import java.util.Random;

public class Mago extends Personagem{
	
	private int magia;
	
	
	public Mago(String nome, int vida, int inteligencia, int forca) {
		super(nome, vida, inteligencia, forca);
	}
	
	ArrayList<String> habMago = new ArrayList<String>();

	Random random = new Random();
	
	public void apresentar() {
		System.out.println("=== FICHA DO MAGO ===");
		System.out.println("Level: " + this.getLevel());
		System.out.println("Inteligência " + this.getInteligencia());
		System.out.println("Mana: " + this.getMana());
		System.out.println("Força: " + this.getForca());
		System.out.println("Vida: " + this.getVida());
	}
	
	@Override
	public void lvlUp() {
		this.setForca(this.getForca() + 1);
		this.setInteligencia(this.getInteligencia() + 2);
		this.setLevel(this.getLevel() + 1);
		this.setMana(this.getMana() + 3);
		int x = random.nextInt(5) + 1;
		this.setVida(this.getVida() + x);
		this.setXp(this.getXp() + 2500);		
	}
	

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}
	
	public void attack() {
		int x = random.nextInt(23);
		this.setMagia(this.getInteligencia()*this.getLevel() + x);
		int a = random.nextInt(habMago.size());
		System.out.println("O mago atacou com a magia " + habMago.get(a) + 
						   "! Causando um total de " + this.getMagia() + " de dano!!");
	}
	
	public void aprenderMagia(String h) {
		habMago.add(h);
	}
	

}
