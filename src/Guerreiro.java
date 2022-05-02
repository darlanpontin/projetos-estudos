import java.util.ArrayList;
import java.util.Random;

public class Guerreiro extends Personagem{
	
	private int habilidade;

	public Guerreiro(String nome, int vida, int inteligencia, int forca) {
		super(nome, vida, inteligencia, forca);
	}
	
	ArrayList<String> habGuerreiro = new ArrayList<String>();

	public int getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(int habilidade) {
		this.habilidade = habilidade;
	}
	
	public void apresentar() {
		System.out.println("=== FICHA DO GUERREIRO ===");
		System.out.println("Level: " + this.getLevel());
		System.out.println("Inteligência " + this.getInteligencia());
		System.out.println("Mana: " + this.getMana());
		System.out.println("Força: " + this.getForca());
		System.out.println("Vida: " + this.getVida());
	}
	
	Random random = new Random();
	
	@Override
	public void lvlUp() {
		this.setForca(this.getForca() + 2);
		this.setInteligencia(this.getInteligencia() + 1);
		this.setLevel(this.getLevel() + 1);
		this.setMana(this.getMana() + 0);
		int x = random.nextInt(5) + 1;
		this.setVida(this.getVida() + x);
		this.setXp(this.getXp() + 2500);		
	}
	
	public void attack() {
		int x = random.nextInt(10);
		this.setHabilidade(this.getForca()*this.getLevel() + x);
		int a = random.nextInt(habGuerreiro.size());
		System.out.println("O Guerreiro atacou com " + habGuerreiro.get(a) + 
						   "! Causando um total de " + this.getHabilidade() + " de dano!!");
	}
	
	public void aprenderHabilidade(String hab) {
		habGuerreiro.add(hab);
	}
}
