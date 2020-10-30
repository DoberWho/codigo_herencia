package com.castelaofpe.maven.tienda.controllers;

import java.util.List; 

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import com.castelaofpe.maven.tienda.models.Categoria; 

public class CategoriaController implements GenericController<Categoria> {
	
	@PersistenceContext(unitName = "UD01", type = PersistenceContextType.EXTENDED)
    private EntityManager entityManager;

	@Override
	public Categoria get(long id) {
		return (Categoria) entityManager.find(Categoria.class, id);
	}

	@Override
	public List<Categoria> getAll() {
		Query q03 = entityManager.createQuery("select e from Categoria e");  
        return q03.getResultList();
	}

	@Override
	public void save(Categoria t) {
		entityManager.persist(t); 
	}

	@Override
	public void update(Categoria t) { 
		entityManager.persist(t); 
		
	}

	@Override
	public void delete(Categoria t) {
		entityManager.remove(t);
	}
	
	

}
