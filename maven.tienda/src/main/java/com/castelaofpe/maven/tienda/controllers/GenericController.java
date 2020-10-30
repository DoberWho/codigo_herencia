package com.castelaofpe.maven.tienda.controllers;

import java.util.List;
import java.util.Optional;

public interface GenericController<T> {
	
	  T get(long id);
	  List<T> getAll();
	    
	  void save(T t);
	    
	  void update(T t);
	    
	  void delete(T t);
 
}
