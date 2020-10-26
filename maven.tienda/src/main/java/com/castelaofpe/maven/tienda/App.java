package com.castelaofpe.maven.tienda;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

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
         
         
         // read the existing entries and write to console
         Query q = em.createQuery("select e from Persona e");
         List<Persona> employeeList = q.getResultList();
         for (Persona employee : employeeList) {
           System.out.println(employee);
         }
         System.out.println("Size: " + employeeList.size());        
         
         
         Query q02 = em.createQuery("select e from Usuario e");
         List<Usuario> usuarios = q02.getResultList();
         for (Usuario usuario : usuarios) {
           System.out.println(usuario);
         }
         System.out.println("Size: " + usuarios.size());
         
         Query q03 = em.createQuery("select e from Producto e");
         List<Producto> productos = q03.getResultList();
         for (Producto producto : productos) {
           System.out.println(producto);
         }
         System.out.println("Size: " + productos.size());
         
         
         
         // create new todo
         
         
         Persona per = new Persona();
         per.setName("Mukesh"); 
         per.setLastname("Apellido");
         
         em.persist(per);
         
         trans.commit(); 
         em.close(); 
    }
}
