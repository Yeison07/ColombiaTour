package com.colombiaTour.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sitioweb")
public class SitioWeb implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer idsitioweb;
	private String quienessomos;
	private String mision;
	private String vision;
	private String acercadenstro;


	public SitioWeb() {
		// TODO Auto-generated constructor stub
	}





	public Integer getIdsitioweb() {
		return idsitioweb;
	}





	public void setIdsitioweb(Integer idsitioweb) {
		this.idsitioweb = idsitioweb;
	}





	public String getQuienessomos() {
		return quienessomos;
	}




	public void setQuienessomos(String quienessomos) {
		this.quienessomos = quienessomos;
	}




	public String getMision() {
		return mision;
	}


	public void setMision(String mision) {
		this.mision = mision;
	}


	public String getVision() {
		return vision;
	}


	public void setVision(String vision) {
		this.vision = vision;
	}


	public String getAcercadenstro() {
		return acercadenstro;
	}


	public void setAcercadenstro(String acercadenstro) {
		this.acercadenstro = acercadenstro;
	}


}
