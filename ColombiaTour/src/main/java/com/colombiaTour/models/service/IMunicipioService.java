package com.colombiaTour.models.service;

import java.util.List;

import com.colombiaTour.models.entity.Municipio;

public interface IMunicipioService {

	public List<Municipio> findAll();
	public void insertar(Municipio muni);
	public Municipio findMunicipio(Integer muni);
	public void delete(Integer muni);


}
