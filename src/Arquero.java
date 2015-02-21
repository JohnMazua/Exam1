
public class Arquero extends Personaje {
	public int vida;
	public int ataque;
	private int flechas;
	
	public Arquero(int vida, int ataque, int flechas)
	{
		this.vida = vida;
		this.ataque = ataque;
		this.flechas = flechas;
	}
	
	public void poderEspecial()
	{
		System.out.println("Has activado el poder especial");
		System.out.println("Se han agregado 5 flechas a tu aljaba"+((this.flechas)+5));
	}
}
