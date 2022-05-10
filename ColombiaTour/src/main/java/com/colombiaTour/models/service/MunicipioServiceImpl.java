package com.colombiaTour.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colombiaTour.models.entity.Municipio;
import com.colombiaTour.models.repository.MunicipioRepositoy;

@Service
public class MunicipioServiceImpl implements IMunicipioService{

	@Autowired
	private MunicipioRepositoy mr;

	@Override
	public List<Municipio> findAll() {
		// TODO Auto-generated method stub
		return (List<Municipio>)mr.findAll();

	}

	@Override
	public void insertar(Municipio muni) {
		// TODO Auto-generated method stub
		mr.save(muni);

	}

	@Override
	public Municipio findMunicipio(Integer muni) {
		// TODO Auto-generated method stub
		return mr.findById(muni).orElse(null);
	}

	@Override
	public void delete(Integer muni) {
		// TODO Auto-generated method stub
		mr.deleteById(muni);

	}

}
