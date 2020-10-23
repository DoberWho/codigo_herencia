package com.castelaofpe.maven.tienda.models; 


public class Producto {
 

	private int id = 0;
	public String name = "";
	public String desc = "";
	public int precio = 0; 
	public int stock = 1;
	
 
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "ID:"+this.id+" -> Nombre: "+this.name+" - Precio: "+this.precio+" - Stock: "+this.stock;
	}

}
