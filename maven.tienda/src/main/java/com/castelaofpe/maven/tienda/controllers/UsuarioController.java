package com.castelaofpe.maven.tienda.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
 
import com.castelaofpe.maven.tienda.models.Usuario;

public class UsuarioController implements GenericController<Usuario> {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("UD01");
    private EntityManager entityManager = factory.createEntityManager();


	@Override
	public Usuario get(long id) {
		return (Usuario) entityManager.find(Usuario.class, id);
	}

	@Override
	public List<Usuario> getAll() {
		Query q03 = entityManager.createQuery("select e from Usuario e");  
        return q03.getResultList();
	}

	@Override
	public void save(Usuario t) {
		entityManager.persist(t); 
	}

	@Override
	public void update(Usuario t) {
		entityManager.persist(t);
	}

	@Override
	public void delete(Usuario t) {
		entityManager.remove(t);
	}

}
