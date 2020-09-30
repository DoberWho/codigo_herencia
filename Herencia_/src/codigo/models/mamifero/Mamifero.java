package codigo.models.mamifero;

import codigo.models.Animal;

public abstract class Mamifero extends Animal{

	private int vida = 200;
	
	public abstract void mama();
	
	@Override
	public boolean estaVivo() {
		return (vida > 0);
	}
}
