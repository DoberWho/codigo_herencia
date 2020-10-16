package codigo.models.lagarto;

import codigo.models.interfaces.PuedeNadar;

public class Cocodrilo extends Lagarto implements PuedeNadar{

	public void muerde() {}

	@Override
	public boolean seRegenera() {
		return false;
	}

	@Override
	public void caminar() {
		System.out.println("Cocodrilo Camina");
	}

	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		
	}

	
}
