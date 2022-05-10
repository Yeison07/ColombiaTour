package com.colombiaTour.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="clima")
public class Clima implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer idclima;
	private String max;
	private String min;

	@OneToOne(mappedBy = "clima")
	private Municipio municipio;

	public Clima() {
		// TODO Auto-generated constructor stub
	}


	public Integer getIdclima() {
		return idclima;
	}


	public void setIdclima(Integer idclima) {
		this.idclima = idclima;
	}


	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public String getMin() {
		return min;
	}

	public void setMin(String min) {
		this.min = min;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}


}
