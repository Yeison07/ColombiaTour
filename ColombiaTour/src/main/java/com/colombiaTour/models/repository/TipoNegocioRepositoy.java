package com.colombiaTour.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.colombiaTour.models.entity.TipoNegocio;

@Repository
public interface TipoNegocioRepositoy extends CrudRepository<TipoNegocio, Integer>{

}
