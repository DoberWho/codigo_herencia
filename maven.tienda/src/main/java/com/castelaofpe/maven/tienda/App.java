package com.castelaofpe.maven.tienda;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.castelaofpe.maven.tienda.models.Persona;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        
    	 EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
         EntityManager em = factory.createEntityManager();
         
         
         // read the existing entries and write to console
         Query q = em.createQuery("select e from Persona e");
         List<Persona> employeeList = q.getResultList();
         for (Persona employee : employeeList) {
           System.out.println(employee);
         }
         System.out.println("Size: " + employeeList.size());
         
         
         // create new todo
         EntityTransaction trans = em.getTransaction();
         trans.begin();
         
         Persona per = new Persona();
         per.setName("Mukesh"); 
         per.setLastname("Apellido");
         
         em.persist(per);
         
         trans.commit();
         em.close();
    	
    	
    }
}
