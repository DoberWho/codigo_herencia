package com.castelaofpe.maven.tienda.controllers;

import java.util.List;

import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.castelaofpe.maven.tienda.models.Usuario;

public class UsuarioController extends GenericController<Usuario> {
	 
	@Override
	public Usuario get(int id) {
		return (Usuario) entityManager.find(Usuario.class, id);
	}

	@Override
	public List<Usuario> getAll() {
		Query q03 = entityManager.createQuery("select e from Usuario e");  
        return q03.getResultList();
	}

	@Override
	public void save(Usuario t) {
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.persist(t); 
		trans.commit();
	}

	@Override
	public void update(Usuario t) { 
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.persist(t); 
		trans.commit();
		
	}

	@Override
	public void delete(Usuario t) {
		EntityTransaction trans = entityManager.getTransaction();
		entityManager.remove(t); 
		trans.commit(); 
	}

}
