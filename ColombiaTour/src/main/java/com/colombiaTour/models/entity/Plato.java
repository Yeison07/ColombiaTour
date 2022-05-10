package com.colombiaTour.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="plato")
public class Plato implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer idplato;
	private String nombre;
	private String descripcion;
	private String img;
	@ManyToOne()
	@JoinColumn(name = "gastronomia")
	private Gastronomia gastronomia;

	public Plato() {
		// TODO Auto-generated constructor stub
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}



}
