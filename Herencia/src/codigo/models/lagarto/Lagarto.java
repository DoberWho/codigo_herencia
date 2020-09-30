package codigo.models.lagarto;

import codigo.models.Animal;
import codigo.models.interfaces.PuedeCaminar;

public abstract class Lagarto extends Animal implements PuedeCaminar{

	private int vida = 100;
	
	public abstract boolean seRegenera();
	
	@Override
	public boolean estaVivo() {
		return (vida > 0);
	}
}
