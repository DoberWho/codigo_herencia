package com.castelaofpe.maven.tienda;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.castelaofpe.maven.tienda.controllers.CategoriaController;
import com.castelaofpe.maven.tienda.controllers.ProductoController;
import com.castelaofpe.maven.tienda.controllers.ProductoVariantController;
import com.castelaofpe.maven.tienda.controllers.UsuarioController;
import com.castelaofpe.maven.tienda.models.Carrito;
import com.castelaofpe.maven.tienda.models.Categoria;
import com.castelaofpe.maven.tienda.models.Persona;
import com.castelaofpe.maven.tienda.models.Producto;
import com.castelaofpe.maven.tienda.models.Usuario;
import com.castelaofpe.maven.tienda.models.ProductoVariante;

import com.castelaofpe.maven.tienda.controllers.CarritoController;

/**
 * Hello world!
 *
 */
public class App {
	 
	
    public static void main( String[] args ) {    	
    	
    	CategoriaController catCtrl = new CategoriaController();
    	ProductoController prodCtrl = new ProductoController();
    	ProductoVariantController pVariantCtrl = new ProductoVariantController();
    	CarritoController cartCtrl = new CarritoController();
    	UsuarioController userCtrl = new UsuarioController();
    	
    	Usuario user = userCtrl.get(1);
    	
    	catCtrl.beginTransaction();
    	
    	Producto prod02 = new Producto();
    	prod02.setNombre("Zapatillas de Bailar");
    	prod02.setDesc("By Los PetterSellers");
    	prod02.setPrecio(100);
    	prod02.setStock(10000);
    	
    	Categoria cat = new Categoria();
    	cat.setNombre("Zapatillas");
    	catCtrl.save(cat);
    	
    	prod02.categoria = cat;
    	prodCtrl.save(prod02);    	
    	
    	ProductoVariante prodVar = new ProductoVariante();
    	prodVar.setProducto(prod02);
    	prodVar.setStock(prod02.getStock());
    	prodVar.setPrecio(prod02.getPrecio());
    	prodVar.name = "Molonas";
    	pVariantCtrl.save(prodVar);
    	
    	Carrito itemCart = new Carrito();
    	itemCart.productoVariante = prodVar;
    	itemCart.usuario = user;
    	cartCtrl.save(itemCart);
    	
    	userCtrl.commit();
    	
    	List<Carrito> carrito = cartCtrl.getByUser(1);
    	System.out.println(carrito.size());
    	
    	  
    	
    	
    }
}
