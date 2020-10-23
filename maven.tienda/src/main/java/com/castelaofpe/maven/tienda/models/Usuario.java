package com.castelaofpe.maven.tienda.models;
 

public class Usuario {
	 
	private int id = 0;
	public String login = "";
	public String pass = "";
	public int edad = 0;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "ID:"+this.id+" -> Login: "+this.login+" - Pass: "+this.pass+" - Edad: "+this.edad;
	}


}
