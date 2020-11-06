package com.castelaofpe.maven.tienda.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import com.castelaofpe.maven.tienda.models.Categoria;
import com.castelaofpe.maven.tienda.models.Producto;

public class ProductoController implements GenericController<Producto>{
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("UD01");
    private EntityManager entityManager = factory.createEntityManager();

	@Override
	public Producto get(long id) {
		return (Producto) entityManager.find(Producto.class, id);
	}

	@Override
	public List<Producto> getAll() {
		Query q03 = entityManager.createQuery("select e from Producto e");  
        return q03.getResultList();
	}

	@Override
	public void save(Producto t) {
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.persist(t); 
		trans.commit();
	}

	@Override
	public void update(Producto t) { 
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.persist(t); 
		trans.commit();
		
	}

	@Override
	public void delete(Producto t) {
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.remove(t); 
		trans.commit(); 
	}
	
	public List<Producto> getByCategoria(Categoria c) { 
		Query q03 = entityManager.createQuery("select e from Producto e WHERE e.categoria= :cat");
        q03.setParameter("cat", c); 
        return q03.getResultList();
	} 

}
