package com.castelaofpe.maven.tienda.controllers;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.castelaofpe.maven.tienda.models.Categoria; 

public class CategoriaController extends GenericController<Categoria> {
	 
	@Override
	public Categoria get(int id) {
		return (Categoria) entityManager.find(Categoria.class, id);
	}

	@Override
	public List<Categoria> getAll() {
		Query q03 = entityManager.createQuery("select e from Categoria e");  
        return q03.getResultList();
	}

	@Override
	public void save(Categoria t) {
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.persist(t); 
		trans.commit();
	}

	@Override
	public void update(Categoria t) { 
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.persist(t); 
		trans.commit();
		
	}

	@Override
	public void delete(Categoria t) {
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.remove(t); 
		trans.commit(); 
	}
	
	

}
