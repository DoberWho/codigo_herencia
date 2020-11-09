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
@Table(name = "cart")
public class Carrito {
	
	
	@ManyToOne
	@JoinColumn(name="id_producto", nullable=false)
	public ProductoVariante productoVariante;
	
	@ManyToOne
	@JoinColumn(name="id_user", nullable=false)
	public Usuario usuario;
	
	@Column(name="amount")
	public int cantidad = 1;

	public ProductoVariante getProductoVariante() {
		return productoVariante;
	}

	public void setProductoVariante(ProductoVariante productoVariante) {
		this.productoVariante = productoVariante;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
