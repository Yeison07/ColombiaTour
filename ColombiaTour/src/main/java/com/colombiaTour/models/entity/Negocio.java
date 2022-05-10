package com.colombiaTour.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="negocio")
public class Negocio implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer idnegocio;
	private String descripcion;
	private String img;

	@ManyToOne
	@JoinColumn(name="tiponegocio")
	private TipoNegocio tipoN;

	@ManyToOne
	@JoinColumn(name="municipio")
	private Municipio municipio;

	public Negocio() {
		// TODO Auto-generated constructor stub
	}


	public Integer getIdnegocio() {
		return idnegocio;
	}


	public void setIdnegocio(Integer idnegocio) {
		this.idnegocio = idnegocio;
	}


	public Municipio getMunicipio() {
		return municipio;
	}


	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoNegocio getTipoN() {
		return tipoN;
	}

	public void setTipoN(TipoNegocio tipoN) {
		this.tipoN = tipoN;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


}
