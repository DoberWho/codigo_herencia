package codigo;

import codigo.models.Animal;
import codigo.models.interfaces.PuedeCaminar;
import codigo.models.interfaces.PuedeNadar;
import codigo.models.lagarto.Cocodrilo;
import codigo.models.lagarto.Lagarto;
import codigo.models.lagarto.Salamandra;
import codigo.models.mamifero.Delfin;
import codigo.models.mamifero.Elefante;
import codigo.models.mamifero.Mamifero;

public class Main {

	public static void main(String[] args) {
		
		Cocodrilo coco = new Cocodrilo();
		Salamandra sala = new Salamandra();
		Lagarto lagar = sala;
		
		Delfin delf = new Delfin();
		Elefante elef = new Elefante();
		Mamifero mami = new Elefante();
		 
		PuedeCaminar pc = lagar;
		pc = coco;
		pc = elef;
		pc = sala;
		
		PuedeNadar pn = delf; 
		pn = coco; 
		
		
		PuedeCaminar pc1 = new PuedeCaminar() {

			@Override
			public void caminar() {
				System.out.println("Alguien Camina");
			}
			
		}; 
		
		coco.haceLaConga(pc1);
		coco.haceLaConga(coco);
		coco.haceLaConga(elef);
		coco.haceLaConga(sala);
		
		coco.haceLaConga(new PuedeCaminar() {

			@Override
			public void caminar() {
				System.out.println("Alguien Volo Sobre El Nido Del Cuco");
			}
			
		});

	}
	
	
	
	
	
	
	
	

}
