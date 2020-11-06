package com.castelaofpe.maven.tienda.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import com.castelaofpe.maven.tienda.models.Persona; 

public class PersonaController implements GenericController<Persona> {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("UD01");
    private EntityManager entityManager = factory.createEntityManager();


	@Override
	public Persona get(long id) {
		return (Persona) entityManager.find(Persona.class, id);
	}

	@Override
	public List<Persona> getAll() {
		Query q03 = entityManager.createQuery("select e from Usuario e");  
        return q03.getResultList();
	}

	@Override
	public void save(Persona t) {
		entityManager.persist(t); 
	}

	@Override
	public void update(Persona t) {
		entityManager.persist(t);
	}

	@Override
	public void delete(Persona t) {
		entityManager.remove(t);
	}

}
