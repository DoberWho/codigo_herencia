package com.castelaofpe.maven.tienda.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id = 0;
	
	public String login = "";
	
	@Column(name="pass")
	public String password = "";
	public int edad = 0;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	} 
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
		return "ID:"+this.id+" -> Login: "+this.login+" - Pass: "+this.password+" - Edad: "+this.edad;
	}


}