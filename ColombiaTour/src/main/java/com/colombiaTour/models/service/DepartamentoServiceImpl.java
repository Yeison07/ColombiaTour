package com.colombiaTour.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colombiaTour.models.entity.Departamento;
import com.colombiaTour.models.repository.DepartamentoRepositoy;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	@Autowired
	private DepartamentoRepositoy ds;

	@Override
	public List<Departamento> findAll() {
		// TODO Auto-generated method stub
		return (List<Departamento>)ds.findAll();
	}

	@Override
	public void insertar(Departamento depar) {
		ds.save(depar);

	}

	@Override
	public Departamento findDepartamento(Integer depar) {
		// TODO Auto-generated method stub
		return ds.findById(depar).orElse(null);
	}

	@Override
	public void delete(Integer depar) {
		// TODO Auto-generated method stub
		ds.deleteById(depar);

	}

}
