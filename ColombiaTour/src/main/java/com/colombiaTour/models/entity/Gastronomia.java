package com.colombiaTour.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="gastronomia")
public class Gastronomia  implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer idgastronomia;
	private String descripcion;

	@OneToOne(mappedBy = "gastronomia")
	private Municipio municipio;

	@OneToMany(mappedBy = "gastronomia")
	private List <Plato> platos;

	public Gastronomia() {
		// TODO Auto-generated constructor stub
	}



	public Integer getIdgastronomia() {
		return idgastronomia;
	}



	public void setIdgastronomia(Integer idgastronomia) {
		this.idgastronomia = idgastronomia;
	}




	public List<Plato> getPlatos() {
		return platos;
	}



	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
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
