package codigo.models.lagarto;

public class Salamandra extends Lagarto {

	public void envenena() {}

	@Override
	public boolean seRegenera() {
		return true;
	}

	@Override
	public void caminar() {
		System.out.println("Salamandra Camina");
	}
}
