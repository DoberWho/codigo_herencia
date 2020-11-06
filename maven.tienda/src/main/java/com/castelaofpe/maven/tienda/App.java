package com.castelaofpe.maven.tienda;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.castelaofpe.maven.tienda.controllers.CategoriaController;
import com.castelaofpe.maven.tienda.controllers.ProductoController;
import com.castelaofpe.maven.tienda.models.Categoria;
import com.castelaofpe.maven.tienda.models.Persona;
import com.castelaofpe.maven.tienda.models.Producto;
import com.castelaofpe.maven.tienda.models.Usuario;

/**
 * Hello world!
 *
 */
public class App {
	 
	
    public static void main( String[] args ) {    	
    	
    	  
          
         ProductoController ctrl = new ProductoController();
         CategoriaController ctrlCat = new CategoriaController();
         
         // Todos los Objetos
         Categoria cat = ctrlCat.get(1L);
         List<Producto> lista = ctrl.getByCategoria(cat);
         
         for (Producto prod : lista) {
        	 // Trayecto un objecto desde su ID        	 
        	 Producto p = ctrl.get(prod.getId());
			
        	 // Borrando 1 Objeto
        	 ctrl.delete(prod);
		}
          
    }
}
