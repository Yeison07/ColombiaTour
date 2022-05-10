package com.colombiaTour.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="municipio")
public class Municipio implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer idciudad;
	private String nombreciudad;
	private Integer nro_habitantes;
	private String cabecera_municipal;
	private String descripcion;
	private String imgurl;

	@ManyToOne
	@JoinColumn(name="departamento")
	private Departamento departamento;

	@OneToOne
	@JoinColumn(name="gastronomia")
	private Gastronomia gastronomia;

	@OneToMany (mappedBy = "municipio")
	private List <CentroComercial> centrosc;

	@OneToOne
	@JoinColumn(name="historia")
	private Historia historia;

	@OneToMany(mappedBy = "municipio")
	private List <Negocio> negocio;

	@OneToMany(mappedBy = "municipio")
	private List <Vereda> veredas;

	@OneToMany(mappedBy = "municipio")
	private List <Corregimiento> corregimientos;

	@OneToOne
	@JoinColumn(name="clima")
	private  Clima clima;

	public Municipio() {
		// TODO Auto-generated constructor stub
	}



	public Integer getIdciudad() {
		return idciudad;
	}



	public void setIdciudad(Integer idciudad) {
		this.idciudad = idciudad;
	}



	public String getNombreciudad() {
		return nombreciudad;
	}



	public void setNombreciudad(String nombreciudad) {
		this.nombreciudad = nombreciudad;
	}



	public String getImgurl() {
		return imgurl;
	}



	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}



	public List<CentroComercial> getCentrosc() {
		return centrosc;
	}



	public void setCentrosc(List<CentroComercial> centrosc) {
		this.centrosc = centrosc;
	}



	public Integer getNro_habitantes() {
		return nro_habitantes;
	}

	public void setNro_habitantes(Integer nro_habitantes) {
		this.nro_habitantes = nro_habitantes;
	}

	public String getCabecera_municipal() {
		return cabecera_municipal;
	}

	public void setCabecera_municipal(String cabecera_municipal) {
		this.cabecera_municipal = cabecera_municipal;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public Gastronomia getGastronomia() {
		return gastronomia;
	}

	public void setGastronomia(Gastronomia gastronomia) {
		this.gastronomia = gastronomia;
	}



	public Historia getHistoria() {
		return historia;
	}

	public void setHistoria(Historia historia) {
		this.historia = historia;
	}

	public List<Negocio> getNegocio() {
		return negocio;
	}

	public void setNegocio(List<Negocio> negocio) {
		this.negocio = negocio;
	}

	public List<Vereda> getVeredas() {
		return veredas;
	}

	public void setVeredas(List<Vereda> veredas) {
		this.veredas = veredas;
	}

	public List<Corregimiento> getCorregimientos() {
		return corregimientos;
	}

	public void setCorregimientos(List<Corregimiento> corregimientos) {
		this.corregimientos = corregimientos;
	}

	public Clima getClima() {
		return clima;
	}

	public void setClima(Clima clima) {
		this.clima = clima;
	}



}
