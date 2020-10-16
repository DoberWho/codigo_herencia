package codigo.models.mamifero;

import codigo.models.interfaces.PuedeCaminar;

public class Elefante extends Mamifero implements PuedeCaminar{

	public void trompa() {}
	
	@Override
	public void mama() {
		 System.out.println("Sin Problema");
	}

	@Override
	public void caminar() {
		System.out.println("Elefante Camina");
	}
}
