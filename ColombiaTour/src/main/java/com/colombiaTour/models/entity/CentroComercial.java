package com.colombiaTour.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="centrocomercial")
public class CentroComercial implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idcentrocomercial;
	@Column(columnDefinition = "MEDIUMTEXT")
	private String descripcion;

	@ManyToOne
	@JoinColumn(name="municipio")
	private Municipio municipio;

	public CentroComercial() {
		// TODO Auto-generated constructor stub
	}


	public Integer getIdcentrocomercial() {
		return idcentrocomercial;
	}


	public void setIdcentrocomercial(Integer idcentrocomercial) {
		this.idcentrocomercial = idcentrocomercial;
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
