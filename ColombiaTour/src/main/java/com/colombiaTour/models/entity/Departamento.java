package com.colombiaTour.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int iddepartamento;
	private String nombredepartamento;
	private int nro_habitantes;
	@OneToMany(mappedBy = "departamento")
	private List<Municipio>municipios;

	public Departamento() {
		// TODO Auto-generated constructor stub
	}



	public int getIddepartamento() {
		return iddepartamento;
	}



	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}



	public String getNombredepartamento() {
		return nombredepartamento;
	}



	public void setNombredepartamento(String nombredepartamento) {
		this.nombredepartamento = nombredepartamento;
	}



	public List<Municipio> getMunicipios() {
		return municipios;
	}



	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}



	public int getNro_habitantes() {
		return nro_habitantes;
	}

	public void setNro_habitantes(int nro_habitantes) {
		this.nro_habitantes = nro_habitantes;
	}



	@Override
	public String toString() {
		return "Departamento [iddepartamento=" + iddepartamento + ", nombredepartamento=" + nombredepartamento
				+ ", nro_habitantes=" + nro_habitantes + ", municipios=" + municipios + "]";
	}



}
