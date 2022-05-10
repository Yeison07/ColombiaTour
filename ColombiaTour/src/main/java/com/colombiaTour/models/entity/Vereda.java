package com.colombiaTour.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vereda")
public class Vereda implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer idvereda;
	private String nombrevereda;
	private Integer nro_habitantes;
	@ManyToOne
	@JoinColumn(name="municipio")
	private Municipio municipio;

	public Vereda() {
		// TODO Auto-generated constructor stub
	}



	public Integer getIdvereda() {
		return idvereda;
	}



	public void setIdvereda(Integer idvereda) {
		this.idvereda = idvereda;
	}



	public String getNombrevereda() {
		return nombrevereda;
	}



	public void setNombrevereda(String nombrevereda) {
		this.nombrevereda = nombrevereda;
	}



	public Integer getNro_habitantes() {
		return nro_habitantes;
	}

	public void setNro_habitantes(Integer nro_habitantes) {
		this.nro_habitantes = nro_habitantes;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}


}
