package codigo.models.mamifero;

import codigo.models.interfaces.PuedeNadar;

public class Delfin extends Mamifero implements PuedeNadar{


	@Override
	public void mama() {
		 System.out.println("Como Puede");
	}

	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		
	}
}
