package com.castelaofpe.maven.tienda;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
        
    	 EntityManagerFactory factory = Persistence.createEntityManagerFactory("UD01");
         EntityManager em = factory.createEntityManager();
         
         EntityTransaction trans = em.getTransaction();
         trans.begin();
         
         Query qCat = em.createQuery("select e from Categoria e WHERE e.id = "+1, Categoria.class);
         Categoria cat = (Categoria) qCat.getSingleResult();
         
         Query q03 = em.createQuery("select e from Producto e WHERE e.categoria= :cat");
         q03.setParameter("cat", cat);
         List<Producto> productos = q03.getResultList();
         for (Producto producto : productos) {
           System.out.println(producto);
         }
         System.out.println("Size: " + productos.size()); 
        
         
         Producto prod = new Producto();
         prod.nombre = "Producto 666";
         
         prod.categoria = cat;
         em.persist(cat); 
         em.persist(prod); 
         
         trans.commit(); 
         em.close(); 
    }
}
