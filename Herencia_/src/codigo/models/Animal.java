package codigo.models;

import codigo.models.interfaces.PuedeCaminar;

public abstract class Animal {

	public abstract boolean estaVivo(); 
	
	public void haceLaConga(PuedeCaminar pn) {
		for (int i = 0; i < 10; i++) {
			pn.caminar();
		}
	}
}
