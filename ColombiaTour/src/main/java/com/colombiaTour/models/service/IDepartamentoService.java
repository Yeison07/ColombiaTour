package com.colombiaTour.models.service;

import java.util.List;

import com.colombiaTour.models.entity.Departamento;

public interface IDepartamentoService {

	public List<Departamento> findAll();
	public void insertar(Departamento depar);
	public Departamento findDepartamento(Integer depar);
	public void delete(Integer depar);

}
