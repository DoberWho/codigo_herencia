package com.castelaofpe.maven.tienda.models; 
  

public class Persona {	 
	  
		
	private int id = 0;
	public String name = "";  
	public String lastname = "";  
	 
	 

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



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	@Override
	public String toString() {
		return "ID:"+this.id+" -> Nombre: "+this.name+" - Apellidos: "+this.lastname; 
	}
	
 
}
