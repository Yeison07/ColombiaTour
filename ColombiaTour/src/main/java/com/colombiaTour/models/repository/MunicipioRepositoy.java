package com.colombiaTour.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombiaTour.models.entity.Municipio;

@Repository
public interface MunicipioRepositoy extends CrudRepository<Municipio, Integer>{

}
