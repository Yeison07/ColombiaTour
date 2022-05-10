package com.colombiaTour.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tipo_negocio")
public class TipoNegocio implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer idtipo_negocio;
	private String descripcion;
	@OneToMany(mappedBy = "tipoN")
	private List<Negocio> negocios;

	public TipoNegocio() {
		// TODO Auto-generated constructor stub
	}


	public Integer getIdtipo_negocio() {
		return idtipo_negocio;
	}


	public void setIdtipo_negocio(Integer idtipo_negocio) {
		this.idtipo_negocio = idtipo_negocio;
	}


	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Negocio> getNegocios() {
		return negocios;
	}

	public void setNegocios(List<Negocio> negocios) {
		this.negocios = negocios;
	}


}
