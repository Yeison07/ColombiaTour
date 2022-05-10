package com.colombiaTour.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="historia")
public class Historia implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer idhistoria;
	@Column(columnDefinition = "MEDIUMTEXT")
	private String descripcion;

	@OneToOne(mappedBy = "historia")
	private Municipio municipio;

	public Historia() {
		// TODO Auto-generated constructor stub
	}


	public Integer getIdhistoria() {
		return idhistoria;
	}



	public void setIdhistoria(Integer idhistoria) {
		this.idhistoria = idhistoria;
	}



	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}





}
