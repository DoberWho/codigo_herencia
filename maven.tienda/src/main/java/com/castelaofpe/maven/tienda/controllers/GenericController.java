package com.castelaofpe.maven.tienda.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class GenericController<T> {
	 
	EntityManager entityManager = this.getManager();
	
	  abstract T get(long id);
	  abstract List<T> getAll();
	    
	  abstract void save(T t);
	    
	  abstract void update(T t);
	    
	  abstract void delete(T t);
	  
	  private EntityManager getManager() {
		  EntityManagerFactory factory = Persistence.createEntityManagerFactory("UD01");
		  return factory.createEntityManager();
	  }
 
}
