
public class Guerrero extends Personaje {
	public int vida;
	public int ataque;
	
	public Guerrero(int hp, int dam)
	{
		this.vida = hp;
		this.ataque = dam;				
	}
	
	public void poderEspecial()
	{
		System.out.println("Has activado el poder especial");
		System.out.println("Tu vida ha bajado a: "+ ((this.vida)/2));
		System.out.println("Sin embargo tu ataque subio a: "+((this.ataque)*2));
	}
}
