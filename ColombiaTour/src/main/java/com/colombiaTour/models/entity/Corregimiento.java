package com.colombiaTour.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="corregimiento")
public class Corregimiento implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer idcorregimiento;
	private String nombrecorreg;
	private Integer nro_habitantes;

	@ManyToOne
	@JoinColumn(name="municipio")
	private Municipio municipio;

	public Corregimiento() {
		// TODO Auto-generated constructor stub
	}


	public Integer getIdcorregimiento() {
		return idcorregimiento;
	}


	public void setIdcorregimiento(Integer idcorregimiento) {
		this.idcorregimiento = idcorregimiento;
	}


	public String getNombrecorreg() {
		return nombrecorreg;
	}


	public void setNombrecorreg(String nombrecorreg) {
		this.nombrecorreg = nombrecorreg;
	}


	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Integer getNro_habitantes() {
		return nro_habitantes;
	}

	public void setNro_habitantes(Integer nro_habitantes) {
		this.nro_habitantes = nro_habitantes;
	}


}
