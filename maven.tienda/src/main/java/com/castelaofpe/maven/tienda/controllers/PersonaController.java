package com.castelaofpe.maven.tienda.controllers;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.castelaofpe.maven.tienda.models.Persona; 

public class PersonaController extends GenericController<Persona> { 

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
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.persist(t); 
		trans.commit();
	}

	@Override
	public void update(Persona t) { 
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.persist(t); 
		trans.commit();
		
	}

	@Override
	public void delete(Persona t) {
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.remove(t); 
		trans.commit(); 
	}

}
