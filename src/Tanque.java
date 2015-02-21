
public class Tanque extends Personaje {
	public int vida;
	public int ataque;
	private boolean escudo_activado;
	
	public Tanque(int hp, int dam, boolean escudo)
	{
		this.vida = hp;
		this.ataque = dam;
		this.setEscudo_activado(false);
	}
	
	public void poderEspecial()
	{
		System.out.println("Has activado el poder especial");
		System.out.println("Se ha activado tu escudo principal");
	}

	public boolean getEscudo_activado() {
		return escudo_activado;
	}

	public void setEscudo_activado(boolean escudo_activado) {
		this.escudo_activado = escudo_activado;
	}
	
}
