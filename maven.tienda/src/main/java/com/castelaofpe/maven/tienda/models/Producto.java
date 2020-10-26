package com.castelaofpe.maven.tienda.models; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id = 0;
	
	@Column(name="name")
	public String nombre = "";
	public String desc = "";
	public int precio = 0; 
	public int stock = 1;
	
	@ManyToOne
	@JoinColumn(name="id_category", nullable=false)
	public Categoria categoria;
	
 
	/**
	 * 
	 * @return 100 = 1,00
	 */
	public int getPrecio() {
		return precio;
	}
	/**
	 * 
	 * @return 100 = 1,00
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	} 
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	 
	@Override
	public String toString() {
		return "ID:"+this.id+" -> Nombre: "+this.nombre+" - Precio: "+this.precio+" - Stock: "+this.stock;
	}

}
